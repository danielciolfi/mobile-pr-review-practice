# ADR-001: MVVM

Screen logic lives in ViewModels. Views observe state and dispatch events only. Views must
not contain business logic or perform data access.