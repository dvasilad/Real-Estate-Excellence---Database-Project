CREATE TABLE Properties (
        property_id INT AUTO_INCREMENT PRIMARY KEY,
        property_type VARCHAR(50),            // e.g., apartment, office, house
        address VARCHAR(255),
        city VARCHAR(50),
        zip_code VARCHAR(10),
        size_sqft DECIMAL(10,2),
        num_rooms INT,
        features VARCHAR(255),                // e.g., "parking, pool, garden"
        availability_status ENUM('available', 'sold', 'rented'),
        price DECIMAL(15,2)                   // Sale price or monthly rental rate
        );

        CREATE TABLE Clients (
        client_id INT AUTO_INCREMENT PRIMARY KEY,
        client_type ENUM('buyer', 'seller', 'renter', 'landlord'),
        name VARCHAR(100),
        phone VARCHAR(20),
        email VARCHAR(100),
        address VARCHAR(255),
        preferred_location VARCHAR(100),
        preferred_property_type VARCHAR(50),   // Desired type of property
        budget_min DECIMAL(15,2),
        budget_max DECIMAL(15,2),
        interaction_history TEXT              // Notes on inquiries, viewings, purchases, etc.
        );

        CREATE TABLE Agents (
        agent_id INT AUTO_INCREMENT PRIMARY KEY,
        name VARCHAR(100),
        phone VARCHAR(20),
        email VARCHAR(100),
        address VARCHAR(255),
        performance_metrics INT DEFAULT 0,      // Number of properties sold or rented
        total_commission DECIMAL(15,2) DEFAULT 0
        );

        CREATE TABLE Transactions (
        transaction_id INT AUTO_INCREMENT PRIMARY KEY,
        transaction_type ENUM('sale', 'rental'),
        property_id INT,
        client_id INT,
        agent_id INT,
        transaction_date DATE,
        sale_price DECIMAL(15,2),               // Sale price or rental fees
        commission_amount DECIMAL(15,2),        // Commission for the agent
        payment_schedule TEXT,                  // Details on payment installments if any
        transaction_status ENUM('in-progress', 'completed', 'canceled'),
        FOREIGN KEY (property_id) REFERENCES Properties(property_id),
        FOREIGN KEY (client_id) REFERENCES Clients(client_id),
        FOREIGN KEY (agent_id) REFERENCES Agents(agent_id)
        );

        CREATE TABLE AgentAssignments (
        //connects agents to specific properties and clients
        assignment_id INT AUTO_INCREMENT PRIMARY KEY,
        agent_id INT,
        property_id INT,
        client_id INT,
        FOREIGN KEY (agent_id) REFERENCES Agents(agent_id),
        FOREIGN KEY (property_id) REFERENCES Properties(property_id),
        FOREIGN KEY (client_id) REFERENCES Clients(client_id)
        );


