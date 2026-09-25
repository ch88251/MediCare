# MediCare App

A demonstration of converting a static healthcare website from a bootstrap template
that I purchased from https://bootstrapmade.com/medicare-bootstrap-template/ into 
a full-stack web application.


## Architecture

The application uses Java Spring Boot Microservices backend where each service owns its 
own database. The frontend is built with React.

### Backend

| Service | Responsibility | Status |
|---|---|---|
| `catalog-service` | Departments, services, locations | **In progress** |
| `doctor-service` | Doctor profiles, schedules, reviews, search | Not started |
| `appointment-service` | Slots, bookings (first calls between services) | Not started |
| `content-service` | FAQ, testimonials, gallery, stats, contact form | Not started |
| `api-gateway` | Routing, CORS, JWT validation (add once several services exist) | Not started |
| `auth-service` | Patient/admin login, JWT | Not started |
| `notification-service` | Email/SMS (can be mocked) | Not started |

