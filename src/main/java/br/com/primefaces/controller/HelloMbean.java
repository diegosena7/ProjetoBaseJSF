package br.com.primefaces.controller;

import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean("helloBean")
@ViewScoped
public class HelloMbean {

	String teste = "testandoJSF";
}
