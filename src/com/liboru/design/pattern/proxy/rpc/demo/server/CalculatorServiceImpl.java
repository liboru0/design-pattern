package com.liboru.design.pattern.proxy.rpc.demo.server;

public class CalculatorServiceImpl implements CalculatorService {

  @Override
  public int add(int a, int b) {
    return a + b;
  }

}
