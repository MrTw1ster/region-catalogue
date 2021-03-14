package ru.telda.config.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.telda.entity.Region;
import ru.telda.entity.RegionService;
import ru.telda.mapper.RegionMapper;

import java.util.List;

@Service
@Transactional
public class RegionServiceImpl implements RegionService {

    @Autowired
    private RegionMapper regionMapper;

    /**
     * Запрос
     * @return
     */
    @Override
    public List<Region> getAllRegion() {
        return regionMapper.getAllRegion();
    }

    /**
     * Запрос по идентификатору
     * @param id
     * @return
     */
    @Override
    public Region getRegionById(Integer id) {
        return regionMapper.getRegionById(id);
    }

    /**
     * Добавлено
     * @param region
     * @return
     */
    @Override
    public Integer addRegion(Region region) {
        return regionMapper.addRegion(region);
    }

    /**
     * Изменить
     * @param region
     * @return
     */
    @Override
    public Integer updateRegion(Region region) {
        return regionMapper.updateRegion(region);
    }

    /**
     * Удалить
     * @param id
     * @return
     */
    @Override
    public Integer deleteRegionById(Integer id) {
        return regionMapper.deleteRegionById(getRegionById(id));
    }
}
