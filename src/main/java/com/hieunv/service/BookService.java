package com.hieunv.service;

import com.hieunv.entity.Book;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class BookService {
    public List<Book> getBooks(){
        EntityManager  em= Persistence.createEntityManagerFactory("login-pu").createEntityManager();
        List<Book> books= new ArrayList<>();
        try{
            Query query= em.createQuery("select  b from books b");
            books= (List<Book>)  query.getResultList();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            em.close();
        }
        return books;
    }

    public void addBook( String title, String category, long price) {
        EntityManager em = Persistence.createEntityManagerFactory("login-pu").createEntityManager();
        try {
            em.getTransaction().begin();
            Book b = new Book();
            b.setTitle(title);
            b.setCategory(category);
            b.setPrice(price);
            em.persist(b);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
    public void delete(int id) {
        EntityManager em = Persistence.createEntityManagerFactory("login-pu").createEntityManager();
        try {
            em.getTransaction().begin();
            Book emp = em.find(Book.class, id);
            if (emp != null) {
                em.remove(emp);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }

    }
}
