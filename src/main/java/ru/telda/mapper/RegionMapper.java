package ru.telda.mapper;

import ru.telda.entity.Region;

import java.util.List;

public interface RegionMapper {

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
        Integer deleteRegionById(Region region);

    }
