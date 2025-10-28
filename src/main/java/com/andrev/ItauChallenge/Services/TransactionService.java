package com.andrev.ItauChallenge.Services;

import com.andrev.ItauChallenge.Models.TransactionModel;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;

@Service
public class TransactionService {

  TransactionModel transactionModel;
  Queue<TransactionModel> transactionModelQueue = new LinkedList<>();

  public TransactionModel transaction(TransactionModel transactionModel){
    transactionModelQueue.add(transactionModel);
    return transactionModel;
  }


}
