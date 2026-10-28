select requester_id as id, count(*) as num from (select requester_id from requestaccepted union all 
select accepter_id from requestaccepted) as t
group by requester_id order by num desc limit 1;