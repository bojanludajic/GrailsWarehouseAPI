package com.example


import grails.rest.*
import grails.converters.*
import com.example.*

class ItemController extends RestfulController {
    static responseFormats = ['json', 'xml']
    ItemController() {
        super(Item)
    }

    @Override
    def index() {
        if(params.warehouseId) {
            def items = Item.findAllByWarehouse(Warehouse.load(params.long('warehouseId')))
            respond items, status: 200
        } else {
            super.index()
        }
    }
}
