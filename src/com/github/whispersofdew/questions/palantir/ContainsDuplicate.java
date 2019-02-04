package com.github.whispersofdew.questions.palantir;

//Given an array of integers, find if the array contains any duplicates. Your function should return
//true if any value appears at least twice in the array, and it should return false if every element is distinct.

import java.util.HashMap;

class ContainsDuplicate {
  public boolean containsDuplicate(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for(int i: nums) {
      if(map.containsKey(i)) {
        return true;
      } else {
        map.put(i, 1);
      }
    }

    return false;
  }
}