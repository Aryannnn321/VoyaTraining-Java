package com.basic.voter;

public interface IElectionBoothService {
    boolean checkEligibility(int age, String locality, int voterId);
}
