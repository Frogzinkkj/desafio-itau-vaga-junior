package com.andrev.ItauChallenge.Controllers;

import com.andrev.ItauChallenge.Models.TransactionModel;
import com.andrev.ItauChallenge.Services.TransactionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashSet;

@RestController
@RequestMapping("/bank")
public class TransactionController {

  TransactionService transactionService;

  public TransactionController(TransactionService transactionService) {
    this.transactionService = transactionService;
  }
  //Receber Transações: POST /transacao
  //Este é o endpoint que irá receber as Transações.
  // Cada transação consiste de um valor e uma dataHora de quando ela aconteceu:


  @PostMapping("/transaction")
  public TransactionModel doTransaction(@RequestBody TransactionModel transactionModel){
    return transactionService.transaction(transactionModel);

  }




}
