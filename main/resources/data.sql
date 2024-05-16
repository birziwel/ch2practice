INSERT INTO "spring"."authorities" ("username", "authority") VALUES ('john', 'write') ON CONFLICT DO NOTHING;

INSERT INTO "spring"."users" ("username", "password", "enabled") VALUES ('john', '12345', '1') ON CONFLICT DO NOTHING;

