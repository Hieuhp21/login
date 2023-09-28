package com.hieunv.servlet;

import com.hieunv.entity.Book;
import com.hieunv.service.BookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name="BookServlet",value = "/BookServlet")
public class BookServlet extends HttpServlet {
    private final BookService bookService= new BookService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.process(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.process(req, resp);
    }
    public void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action= req.getParameter("action");
        if(action==null){
            List<Book> books= bookService.getBooks();
            req.setAttribute("books",books);
            req.getRequestDispatcher("book_list.jsp").forward(req,resp);
        }else if (action.equals("delete")) {
            int id = Integer.parseInt(req.getParameter("id"));

            bookService.delete(id);
            resp.sendRedirect("/BookServlet");
        } else if (action.equals("add")) {
            Book b= new Book();
            req.setAttribute("book", b);
            req.getRequestDispatcher("add_book.jsp").forward(req, resp);
        } else if(action.equals("create")) {
            String title = req.getParameter("title");
            String category = req.getParameter("category");
            Long price = Long.valueOf(req.getParameter("price"));
            bookService.addBook(title,category,price);
                resp.sendRedirect("/BookServlet");
            }
        }
    }

