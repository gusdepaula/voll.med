ALTER TABLE medicos ADD COLUMN ativo tinyint NOT NULL;
UPDATE medicos SET ativo = 1;