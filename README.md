# Job Recruitment Platform

A Java backend learning project that starts as a Core Java console application and progressively evolves into a Spring Boot-based job and recruitment platform.

## Project Goal

Build a simplified job recruitment platform where:

* Recruiters can create and manage job postings.
* Candidates can browse jobs and apply.
* Recruiters can review applications and update application status.

## Current Phase

### Phase 1 — Core Java Console Version

Currently building the platform using:

* Java
* OOP
* Collections
* ArrayList
* HashMap
* Custom Exceptions
* Console-based menu

Data is currently stored in memory and will be lost when the application restarts.

## Planned Evolution

```text
Phase 1  → Core Java Console
Phase 2  → SQL / Database Design
Phase 3  → JDBC
Phase 4  → Spring Core
Phase 5  → Spring Boot
Phase 6  → REST APIs
Phase 7  → JPA / Hibernate
Phase 8  → Spring Security + JWT
Phase 9  → JUnit / Mockito
Phase 10 → Docker
Phase 11 → Redis (Optional)
Phase 12 → Async / Message Queue (Optional)
Phase 13 → Deployment
```

## Current Domain

```text
User
 ├── Candidate
 └── Recruiter

Recruiter → Job
Candidate → Application
Application → Job
```

## Learning Approach

The project is intentionally developed phase by phase.

Each phase introduces a new technology or architectural concept while extending the same application rather than starting a completely new project.
