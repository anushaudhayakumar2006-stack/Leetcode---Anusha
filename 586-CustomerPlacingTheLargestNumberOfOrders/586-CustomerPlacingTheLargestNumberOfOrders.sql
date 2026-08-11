-- Last updated: 8/11/2026, 4:07:43 PM
SELECT customer_number
FROM Orders
GROUP BY customer_number
ORDER BY count(order_number)DESC
LIMIT 1;
