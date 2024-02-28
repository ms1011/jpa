package com.ohgiraffers.springdatajpa.menu.service;

import com.ohgiraffers.springdatajpa.menu.dto.MenuDTO;
import com.ohgiraffers.springdatajpa.menu.entity.Menu;
import com.ohgiraffers.springdatajpa.menu.repository.CategoryRepository;
import com.ohgiraffers.springdatajpa.menu.repository.MenuRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/* 설명.
 *  Service 계층 : 비즈니스 로직, 트랜잭션 처리(@Transactional), DTO <-> Entity(modelmapper lib 활용)
* */
@Service
public class MenuService {

    private final ModelMapper mapper;
    private final MenuRepository menuRepository;
    private final CategoryRepository categoryRepository;

    @Autowired
    public MenuService(ModelMapper mapper, MenuRepository menuRepository, CategoryRepository categoryRepository) {
        this.mapper = mapper;
        this.menuRepository = menuRepository;
        this.categoryRepository = categoryRepository;
    }

    public MenuDTO findMenuByCode(int menuCode) {

        Menu menu = menuRepository.findById(menuCode).orElseThrow(IllegalArgumentException::new);

        return mapper.map(menu, MenuDTO.class);
    }

}
