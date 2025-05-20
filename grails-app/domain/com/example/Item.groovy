package com.example


import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class Item {
    String name
    Double price
    Warehouse warehouse

    static constraints = {
        name blank: false
        warehouse nullable: false
    }

}