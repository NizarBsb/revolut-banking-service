package com.revolut.rest.v1.service;

import com.revolut.infrastructure.exception.UnknownAccountException;

import java.math.BigDecimal;

public interface TransferService {
    String transfer(long from, long to, BigDecimal amount) throws UnknownAccountException;
}
