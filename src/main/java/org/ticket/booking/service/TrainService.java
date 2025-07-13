package org.ticket.booking.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.ticket.booking.entities.Train;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TrainService {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final String TRAINS_PATH="app/src/main/java/org/ticket/booking/localDb/trains.json";
    private List<Train> trainList = new ArrayList<>();


    public TrainService() throws IOException{
        File trainFile = new File(TRAINS_PATH);
        this.trainList = objectMapper.readValue(trainFile, new TypeReference<List<Train>>() {});
    }

    public List<Train> getTrainList() {
        return trainList;
    }

    public Optional<Train> getTrainByNumber(int trainNo){
        return trainList.stream().filter(t -> t.getTrainNo() == trainNo).findFirst();
    }
    public boolean checkSeatAvailability(String trainNo, D){
        Optional <Train> trainOpt = g
    }

}
