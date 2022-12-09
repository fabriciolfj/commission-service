package com.github.fabriciolfj.providers.kafka.deserializer;

import com.github.fabriciolfj.providers.kafka.dto.ContractCommissionDTO;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class ContractCommissionDTODeserializer extends ObjectMapperDeserializer<ContractCommissionDTO> {

    public ContractCommissionDTODeserializer() {
        super(ContractCommissionDTO.class);
    }
}
