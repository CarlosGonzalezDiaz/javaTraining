package com.carlosgonzalez.spirngboot.di.app.difacturas.controllers;

import com.carlosgonzalez.spirngboot.di.app.difacturas.models.Client;
import com.carlosgonzalez.spirngboot.di.app.difacturas.models.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {

    @Autowired
    private Invoice invoice;

    @GetMapping("/show")
    public Invoice show() {
    Invoice i = new Invoice();
    Client c = new Client();
    c.setName(invoice.getClient().getName());
    c.setLastName(invoice.getClient().getLastName());

    i.setClient(invoice.getClient());
    i.setDescription(invoice.getDescription());
    i.setItems(invoice.getItems());
        return i;

    }
}
