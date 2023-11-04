package com.prm.japaneseapp.controller._public;


import com.prm.japaneseapp.controller.BaseController;
import com.prm.japaneseapp.model.request.AccountRequestDto;
import com.prm.japaneseapp.model.request.AuthRequest;
import com.prm.japaneseapp.service.impl.AccountServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "${apiUrl}")
public class AuthController extends BaseController<AccountServiceImpl> {

    @PostMapping("/public/login")
    public ResponseEntity<Object> login(@Valid @RequestBody AuthRequest authRequest) {
        return this.getObjService().login(authRequest);
    }

    @PostMapping("/public/register")
    public ResponseEntity<Object> register(@Valid @RequestBody AccountRequestDto user) {
        return this.getObjService().register(user);
    }
}
