package com.kodilla.kodillaspring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    //@Bean
    //@Scope("prototype")
    //TaskList list1;

    @Bean
    public Board createBoard() {
        return new Board(new TaskList(), new TaskList(), new TaskList());
    }



    //trzy  różne
    //beany
    //  reprezentujące  listy  zadań  i  wstrzyknie  je  do
    //beana
    //klasy  Board .

}
