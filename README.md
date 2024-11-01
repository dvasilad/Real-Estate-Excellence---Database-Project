# Real Estate Excellence Database

This project implements a database system for **Real Estate Excellence**, a real estate agency managing property listings, client interactions, and transactions. The database is designed to support key agency functions, including property management, client tracking, agent performance monitoring, and transaction handling.

## Project Overview

1. **Database Design**: The schema was initially designed in **SQLite** to generate an Entity-Relationship Diagram (ERD) using **DBeaver**.
2. **MySQL Migration**: The final schema was migrated to **MySQL** and is the version uploaded to this repository.

## Database Structure

The schema includes the following tables:

- **Properties**: Detailed property listings (type, location, size, features, etc.)
- **Clients**: Information about buyers, sellers, renters, and landlords.
- **Agents**: Contact details, assignments, and performance metrics for agents.
- **Transactions**: Records of sales and rental transactions.
- **AgentAssignments**: Link table for agents assigned to specific properties and clients.

## Technologies Used

- **SQLite**: For initial database development and ERD generation.
- **MySQL**: Production database schema uploaded here.
