package com.example.example;

import com.example.example.dao.EmployeeDAO;
import com.example.example.dao.impl.EmployeeDAOImpl;
import com.example.example.entity.EmployeeEntity;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@WebServlet("/employee-servlet/create"

)

public class EmployeeServlet extends HttpServlet {
    private EmployeeDAO employeeDAO;

    public void init(){
        employeeDAO = new EmployeeDAOImpl();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/employee.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String hoten = req.getParameter("hoten");
        String ngaysinh = req.getParameter("ngaysinh");
        String diachi = req.getParameter("diachi");
        String chucvu = req.getParameter("chucvu");
        String phong = req.getParameter("phong");


        EmployeeEntity employee = new EmployeeEntity();
        employee.setId(id);
        employee.setHoten(hoten);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = dateFormat.parse(ngaysinh);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        employee.setNgaysinh(date);
        employee.setDiachi(diachi);
        employee.setChucvu(chucvu);
        employee.setPhong(phong);


        EmployeeDAO employeeDAO = new EmployeeDAO() {
        };
        employeeDAO.createEmployee(employee);


        response.sendRedirect(request.getContextPath() + "/list.jsp");

    }
}
