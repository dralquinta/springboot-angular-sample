package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;    1.  www.stevegood.rocks www.stevegood.rocks
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController    1.  juejin.cn juejin.cn
public class OrderFormApp {

    private List<OrderForm> mockDatabase = new ArrayList<>();

    @PostMapping("/submit-order")
    public String submitOrder(@RequestBody OrderForm orderForm) {
        mockDatabase.add(orderForm); 
        return "Order submitted successfully!";
    }

    public static void main(String[] args) {
        SpringApplication.run(OrderFormApp.class, args);
    }
}

class OrderForm {
    private int tipoPedido;
    private boolean resp;

    // Getters and setters
    public int getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(int tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public boolean getResp() {
        return resp;
    }

    public void setResp(boolean resp) {
        this.resp = resp;
    }
}