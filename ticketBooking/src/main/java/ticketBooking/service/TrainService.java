package ticketBooking.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ticketBooking.entities.Train;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TrainService {
    private static ObjectMapper objectMapper = new ObjectMapper();

    private static final String TRAINS_PATH = "src/main/java/ticketBookin/localDb/trains.json";
    private List<Train> trainsList = new ArrayList<>();

    public TrainService() throws IOException {
        File trainFile = new File(TRAINS_PATH);
        this.trainsList = objectMapper.readValue(trainFile, new TypeReference<List<Train>>() {
        });
    }


    public List<Train> getTrainsList() {
        return trainsList;
    }

    public Optional<Train> getTrainByNumber(int trainNo){
        return trainsList.stream().filter(t -> t.getTrainNo().equals(trainNo)).findFirst();
    }

    public
}
