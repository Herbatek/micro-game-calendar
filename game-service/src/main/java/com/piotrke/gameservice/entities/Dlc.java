package com.piotrke.gameservice.entities;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Data
@Table
public class Dlc {

    @PrimaryKey
    private UUID id;

    private String title;

    private UUID gameId;
}
