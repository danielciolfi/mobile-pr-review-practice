# ADR-003: Repository Pattern

ViewModels depend on Repository classes only. A ViewModel that calls an API client, network
service, or DAO directly bypasses the repository layer and violates this decision.

Keyword tags: repository, ViewModel, API client, data access, DAO.