package camt.se234.lab10.service;

import camt.se234.lab10.entity.Grade;
import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl implements GradeService {
    @Override
    public String getGrade(double score) {
        if (score > 78.9) {
            return "A";
        }
        else if (score > 74.4){
            return "B";
        }else if (score > 59.0){
            return "C";
        }else if (score > 33.0) {
            return "D";
        } else
            return "F";

    }
}
