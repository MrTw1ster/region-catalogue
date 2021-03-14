package ru.telda.entity;


import java.util.List;

public interface RegionService {

    /**
     * Запрос всех пользователей
     */
    List<Region> getAllRegion();

    /**
     * Запрос по идентификатору
     */
    Region getRegionById(Integer id);

    /**
     * Добавить пользователя
     */
    Integer addRegion(Region region);

    /**
     * Изменить пользователя
     */
    Integer updateRegion(Region region);
    /**
     * Удалить пользователя на основе идентификатора
     */
    Integer deleteRegionById(Integer id);
}
