package com.happy.bloodbank.service;

import java.util.List;

import com.happy.bloodbank.entity.State;

public interface StateService {
public List<State> getall();
public State save(State state);

}