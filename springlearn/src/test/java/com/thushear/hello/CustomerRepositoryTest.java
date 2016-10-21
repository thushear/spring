package com.thushear.hello;

import org.junit.Test;

public class CustomerRepositoryTest {


    @Test
    public void test(){
        None none = new None();
        System.out.println(none.getNumber() <= 500);
    }

    class None{
        private Long number;

        public Long getNumber() {
            return number;
        }

        public void setNumber(Long number) {
            this.number = number;
        }
    }
} 
