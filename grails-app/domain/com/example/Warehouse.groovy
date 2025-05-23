package com.example


import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class Warehouse {
    String name
    String location
    int capacity

    static constraints = {
        name blank: false
        location blank: false
        capacity min: 1, nullable: false
    }
}