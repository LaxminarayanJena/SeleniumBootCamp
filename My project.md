I am working on Trellix Endpoint Security Platform, which protects enterprise endpoints from malware, ransomware, and advanced persistent threats (APTs). The product has multiple modules such as Threat Prevention, Firewall, Web Control, and Device Control. My responsibility is to ensure end-to-end quality across UI, API, and backend services.

Modules I Worked On

Threat Prevention Module – Detects and blocks malware in real time.

Firewall & Web Control – Manages network traffic rules and blocks malicious URLs.

Policy Management – Admin can create, deploy, and update endpoint security policies from a central console.

Testing & Automation

UI Automation: Built a Selenium + TestNG + POM framework for the central console (policy creation, policy deployment, and threat alert dashboards).

API Automation: Used Rest Assured to validate REST endpoints—for example:

Policy CRUD operations (POST /policies, PUT /policies/{id}, etc.)

Threat detection logs retrieval (GET /threats)

Agent-to-server heartbeat checks.

Positive Tests: Verify valid policy creation, endpoint agent successfully updating definitions, accurate threat alerts.

Negative Tests: Invalid auth tokens, malformed JSON payloads, stress scenarios like bulk endpoint registrations and policy pushes.

Critical Bug Found

While testing the Threat Prevention module, I discovered that when two simultaneous policy updates were triggered during a high CPU load, the endpoint agent failed to apply the latest signature update and reported a false “up to date” status to the console.

Impact: Potential exposure to zero-day threats.

Root Cause: Race condition in the agent’s policy sync thread.

Outcome: Logged a P1 blocker, collaborated with devs to implement locking and improved retry logic.

End-to-End Scenario Example

Create a new malware-blocking policy in the console.

Deploy it to 500+ endpoints via the policy distribution service.

Trigger a malware sample on a test endpoint.

Validate:

Agent blocks execution.

Threat alert is sent via API.

Dashboard updates in real time.

Negative path: send the same request with invalid token and verify 401 Unauthorized.