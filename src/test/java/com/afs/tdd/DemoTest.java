package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class DemoTest {
    @Test
    void should_return_locationX_0_locationY_1_direction_N_when_execute_command_given_locationX_0_locationY_0_direction_N_action_M() {
        // given
        Application currentMarsRover = new Application(new RoverStatus(0, 0, "N"));
        RoverStatus expectedMarsRover = new RoverStatus(0, 1 ,"N");
        //when
        currentMarsRover.executeCommand("M");
        //then
        assertThat(expectedMarsRover.getLocationX()).isEqualTo((currentMarsRover.getRoverStatus().getLocationX()));
        assertThat(expectedMarsRover.getLocationY()).isEqualTo((currentMarsRover.getRoverStatus().getLocationY()));
        assertThat(expectedMarsRover.getDirection()).isEqualTo((currentMarsRover.getRoverStatus().getDirection()));
    }
    @Test
    void should_return_locationX_0_locationY_negative1_direction_S_when_execute_command_given_locationY_0_direction_S_action_M(){
        //given
        Application currentMarsRover = new Application(new RoverStatus(0, 0, "S"));
        RoverStatus expectedMarsRover = new RoverStatus(0, -1 ,"S");
                
        //when
        currentMarsRover.executeCommand("M");
        
        //then
        assertThat(expectedMarsRover.getLocationX()).isEqualTo((currentMarsRover.getRoverStatus().getLocationX()));
        assertThat(expectedMarsRover.getLocationY()).isEqualTo((currentMarsRover.getRoverStatus().getLocationY()));
        assertThat(expectedMarsRover.getDirection()).isEqualTo((currentMarsRover.getRoverStatus().getDirection()));
    }
    
    @Test
    void should_return_locationX_1_locationY_0_direction_E_when_execute_command_given_locationX_0_locationY_0_direction_E_action_M(){
        //given
        Application currentMarsRover = new Application(new RoverStatus(0, 0, "E"));
        RoverStatus expectedMarsRover = new RoverStatus(1, 0 ,"E");
                
        //when
        currentMarsRover.executeCommand("M");
        
        //then
        assertThat(expectedMarsRover.getLocationX()).isEqualTo((currentMarsRover.getRoverStatus().getLocationX()));
        assertThat(expectedMarsRover.getLocationY()).isEqualTo((currentMarsRover.getRoverStatus().getLocationY()));
        assertThat(expectedMarsRover.getDirection()).isEqualTo((currentMarsRover.getRoverStatus().getDirection()));
    }

    @Test
    void should_return_locationX_negative1_locationY_0_direction_W_when_execute_command_given_locationX_0_locationY_0_direction_W_action_M(){
        //given
        Application currentMarsRover = new Application(new RoverStatus(0, 0, "W"));
        RoverStatus expectedMarsRover = new RoverStatus(-1, 0 ,"W");

        //when
        currentMarsRover.executeCommand("M");

        //then
        assertThat(expectedMarsRover.getLocationX()).isEqualTo((currentMarsRover.getRoverStatus().getLocationX()));
        assertThat(expectedMarsRover.getLocationY()).isEqualTo((currentMarsRover.getRoverStatus().getLocationY()));
        assertThat(expectedMarsRover.getDirection()).isEqualTo((currentMarsRover.getRoverStatus().getDirection()));
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_W_when_execute_command_given_locationX_0_locationY_0_direction_N_action_L(){
        //given
        Application currentMarsRover = new Application(new RoverStatus(0, 0, "N"));
        RoverStatus expectedMarsRover = new RoverStatus(0, 0 ,"W");
                
        //when
        currentMarsRover.executeCommand("L");
        
        //then
        assertThat(expectedMarsRover.getLocationX()).isEqualTo((currentMarsRover.getRoverStatus().getLocationX()));
        assertThat(expectedMarsRover.getLocationY()).isEqualTo((currentMarsRover.getRoverStatus().getLocationY()));
        assertThat(expectedMarsRover.getDirection()).isEqualTo((currentMarsRover.getRoverStatus().getDirection()));
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_E_when_execute_command_given_locationX_0_locationY_0_direction_S_action_L(){
        //given
        Application currentMarsRover = new Application(new RoverStatus(0, 0, "S"));
        RoverStatus expectedMarsRover = new RoverStatus(0, 0 ,"E");

        //when
        currentMarsRover.executeCommand("L");

        //then
        assertThat(expectedMarsRover.getLocationX()).isEqualTo((currentMarsRover.getRoverStatus().getLocationX()));
        assertThat(expectedMarsRover.getLocationY()).isEqualTo((currentMarsRover.getRoverStatus().getLocationY()));
        assertThat(expectedMarsRover.getDirection()).isEqualTo((currentMarsRover.getRoverStatus().getDirection()));
    }

}
