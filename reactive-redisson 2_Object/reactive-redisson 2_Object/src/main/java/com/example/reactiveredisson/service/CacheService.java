package com.example.reactiveredisson.service;

import com.example.reactiveredisson.entity.Booking;
import com.maersk.telikos.model.CacheImpl;
import org.springframework.stereotype.Service;


@Service
public class CacheService extends CacheImpl<String,Booking>{

}
