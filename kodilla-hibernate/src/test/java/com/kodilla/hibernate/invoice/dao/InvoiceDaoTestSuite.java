package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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
        //Given & When

        Invoice invoice1 = new Invoice("1", null);
        Invoice inv1 = invoiceDao.save(invoice1);

        Product egg = new Product("Egg");
        Product carrot = new Product("Carrot");
        Product prodEgg = productDao.save(egg);
        Product prodCarrot = productDao.save(carrot);

        Item item1 = new Item(egg, BigDecimal.ONE,12, BigDecimal.TEN);
        Item item2 = new Item(carrot, BigDecimal.ONE,1, BigDecimal.ONE);
        Item it1 = itemDao.save(item1);
        Item it2 = itemDao.save(item2);

        item1.setProduct(egg);
        item2.setProduct(carrot);
        itemDao.save(item1);
        itemDao.save(item2);

        //egg.getItems().add(item1);
        egg.setItems(List.of(    item1   ));
        carrot.getItems().add(item2);
        productDao.save(egg);
        productDao.save(carrot);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        itemDao.save(item1);
        itemDao.save(item2);

        //Then
        assertEquals("1", inv1.getNumber());

        System.out.println(inv1.getItems() ); // null
        //System.out.println(inv1.getItems().size() ); // error

        System.out.println(inv1.getNumber() );
        //System.out.println(inv1.getItems().get(0) ); // error
        System.out.println("\n\n\n!!!!!!!!!!!!\n\n\n\n");

        System.out.println(prodEgg.getItems().size()); // no error
        assertEquals(1, prodEgg.getItems().size());
        assertEquals(it1, prodEgg.getItems().get(0));
        assertEquals("Carrot", prodCarrot.getName());
        assertEquals("1", it1.getInvoice().getNumber());
        assertEquals(BigDecimal.ONE, it2.getPrice());

        //Clean-up
        invoiceDao.deleteAll();
        productDao.deleteAll();
        itemDao.deleteAll();


    }
}
