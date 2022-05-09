package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private ProductDao productDao;

    @Autowired
    private ItemDao itemDao;

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product egg = new Product("Egg");
        Product carrot = new Product("Carrot");

        Item item1 = new Item(egg, BigDecimal.ONE,12, BigDecimal.TEN);
        Item item2 = new Item(carrot, BigDecimal.ONE,1, BigDecimal.ONE);

        Invoice invoice1 = new Invoice();

        item1.setProduct(egg);

        invoice1.getItems().add(item1); //item1.setInvoice(invoice1);

        //When
        productDao.save(egg);
        productDao.save(carrot);

        itemDao.save(item1);
        itemDao.save(item2);

        //invoiceDao.save(invoice1);


        //Then


        //Clean-up



    }
}
