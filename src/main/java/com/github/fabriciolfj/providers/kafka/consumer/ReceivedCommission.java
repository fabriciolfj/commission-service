package com.github.fabriciolfj.providers.kafka.consumer;

import com.github.fabriciolfj.providers.kafka.dto.ContractCommissionDTO;
import io.smallrye.mutiny.Uni;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
@Slf4j
public class ReceivedCommission {

    @Incoming("commission-service")
    @Transactional
    public void process(final ContractCommissionDTO dto) {
        Uni.createFrom().item(dto)
                .subscribe()
                .with(c -> log.info("Receive commision {}", dto));
    }
}
