package com.foxsec.user_services.adit;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

@Component("AuditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        // Here you can implement logic to retrieve the current auditor's username or ID
        // For example, you might retrieve it from the security context or session
        // String currentAuditor = getCurrentAuditorFromSecurityContext();
        return Optional.of("system"); // Replace with actual logic to get the current auditor
    }

}
