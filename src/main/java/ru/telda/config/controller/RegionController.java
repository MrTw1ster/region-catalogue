package ru.telda.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.telda.entity.Region;
import ru.telda.entity.RegionService;

import java.util.List;

@RestController
//@Controller
// @ RequestMapping (value = "/ users") // В этой конфигурации следующие сопоставления находятся в / users
public class RegionController {

    @Autowired
    private RegionService regionService;

    /**
     * Запрос всех пользователей
     * Обработка запроса "/ users" для получения списка пользователей
     * Вы также можете передавать параметры со страницы через @RequestParam для передачи условий запроса или информации о перелистывании страниц.
     * @return
     */
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public List<Region> getAllUser() {
        List<Region> users=regionService.getAllRegion();
        return users;
    }

    /**
     * Добавить пользователя
     * Обработать POST-запрос "/ users" для создания User
     * @param region
     */
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String addUser(@ModelAttribute Region region) {
        Integer addUser = regionService.addRegion(region);
        return "success";
    }

    /**
     * Запрос по идентификатору
     * Обработать "/ users / {id}" GET-запрос для получения информации о пользователе значения id в URL
     * Идентификатор в URL может быть связан с параметром функции через @PathVariable
     * @param id
     * @return
     */
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public Region getUserById(@PathVariable("id") Integer id) {
        Region region=regionService.getRegionById(id);
        return region;
    }



    /**
     * Обновление пользователя
     * Обработка запросов PUT для "/ users / {id}" для обновления информации о пользователе
     * @param region
     */
    @RequestMapping(value="/user/{id}",method = RequestMethod.PUT)
    public String updateUser(@PathVariable("id") Integer id, @ModelAttribute Region region) {
        Integer updateUser = regionService.updateRegion(region);
        return "success";
    }

    /**
     * Обработка запроса на удаление «/ users / {id}» для удаления пользователя.
     * @param id
     */
    @RequestMapping(value="/user/{id}",method = RequestMethod.DELETE)
    public String deleteUserById(@PathVariable("id") Integer id) {
        Integer deleteUserById = regionService.deleteRegionById(id);
        return "success";
    }
}
