# CustomerServletDbms
Customer Index Pages

<img width="953" alt="Screenshot 2023-05-02 174925" src="https://user-images.githubusercontent.com/113417088/235664438-dd8bf801-ecdb-4dcf-8029-71992737b69b.png">


1.1) • Create servlet page in "tb_customer" table. Columns: id, name, code, email, phone, contact_person_name, contact_person_phone, status, created_date, created_by, modified_date, modified_by.

<img width="871" alt="Screenshot 2023-05-02 165158" src="https://user-images.githubusercontent.com/113417088/235655568-3eef0116-0ce5-47b8-b44f-0722394bf464.png">

1.2)   • Create servlet page "tb_customer_address" table. Columns: id, customer_id, address_type, address_line1, address_line2, city, state,country,postal_code. Add unique constraints for customer_id and address_type column.

<img width="952" alt="Screenshot 2023-05-02 164827" src="https://user-images.githubusercontent.com/113417088/235655868-73ad258c-295b-49fb-95c0-644f69ad81b8.png">

1.3)   •  Create servlet page "customer_order" table. Columns: id, customer_id, order_no, order_date, no_of_items, order_sub_total, order_discount, order_total_amount, payment_type, delivery_date, status, created_date, created_by, modified_date, modified_by.

<img width="956" alt="Screenshot 2023-05-02 164946" src="https://user-images.githubusercontent.com/113417088/235656203-70cfb756-9216-41c9-8dee-e9558c9cea1a.png">

1.4)  • Create servlet page "customer_order_item" table. Columns: id, order_id, item_name, item_sku, item_rate, ordered_qty, order_total.

<img width="958" alt="Screenshot 2023-05-02 165045" src="https://user-images.githubusercontent.com/113417088/235656437-8ad668de-fa8c-43bc-8fc2-47c78c4cbd96.png">


2)   •To  Create servlet page ,insert 10 customer records. Each customer should have a minimum of 2-3 address records with different address types. Each customer record id should be mapped as foreign key in the customer address table. All insert scripts  should be mentioned in a single SQL file and table data snippet should be taken for the proof.
<img width="496" alt="Screenshot 2023-05-02 174949" src="https://user-images.githubusercontent.com/113417088/235664519-c9eb67d5-e0e4-464a-a7c4-69ae0e4b0ef9.png">

3)  • Write select query to pull data from customer table. Record the script and take a snippet of output.

<img width="774" alt="Screenshot 2023-05-02 165321" src="https://user-images.githubusercontent.com/113417088/235664711-9b121e77-857c-4d16-bd8a-14c70e637d12.png">


4) • Update top 5 customer status as Deleted from Active & also update modified time as well.

<img width="664" alt="Screenshot 2023-05-02 165547" src="https://user-images.githubusercontent.com/113417088/235664828-82bf0245-ab0b-4a34-828d-1383907d417d.png">

5) Write select query to pull only an active status customer.

<img width="767" alt="Screenshot 2023-05-02 175409" src="https://user-images.githubusercontent.com/113417088/235665237-0148dc2c-3692-4f7e-be09-2bc8a9d6cc4d.png">


6)  • Write query to pull all active customers with only the home address type address record.

<img width="833" alt="Screenshot 2023-05-02 175537" src="https://user-images.githubusercontent.com/113417088/235665535-7f7ca316-c9c9-4f2c-bad9-bbccb25ea24f.png">

7) • let's consider customer is creating orders. Each order must have one or more items. Basically write insert statements with proper order items. Create orders only for half of the customers.

<img width="713" alt="Screenshot 2023-05-02 175646" src="https://user-images.githubusercontent.com/113417088/235665770-50bf15df-1bc0-4e84-a15e-7feabf778502.png">















 
