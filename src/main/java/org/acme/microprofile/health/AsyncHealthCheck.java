package org.acme.microprofile.health;

import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;

import java.time.Duration;

@Liveness
@ApplicationScoped
public class AsyncHealthCheck implements io.smallrye.health.api.AsyncHealthCheck {

    @Override
    public Uni<HealthCheckResponse> call() {
        return Uni.createFrom().item(HealthCheckResponse.up("Simple ASYNC health check"));
    }
}