package com.macro.mall.mapper;

import com.macro.mall.model.DCmsPeople;

import java.util.List;

public interface DCmsPeopleMapper {

    void insertPeopleList(List<DCmsPeople> peopleList);

    void delpeopelById(String dataId);

    List selectPeoList(String dataId);
}