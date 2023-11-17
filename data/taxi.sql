CREATE TABLE IF NOT EXISTS taxis (
   id INT PRIMARY KEY,
   placa VARCHAR (10) NOT NULL
);

INSERT INTO taxis (id, placa)
VALUES
    (7249, 'CNCJ-2997'),
    (10133, 'PAOF-6727');


INSERT INTO taxis (id, placa)
VALUES
    (2210, 'FGMG-3071'),
    (1065, 'GHDN-9291'),
    (7956, 'CCKF-1601'),
    (252, 'LAHG-7611'),
    (9557, 'BOIG-0354'),
    (4485, 'LLEL-9271')
    (6418, 'GHGH-1458');

CREATE TABLE IF NOT EXISTS trajetos (
    taxi_id INT,
    data_hora TIMESTAMP,
    latitude DOUBLE PRECISION,
    longitude DOUBLE PRECISION,
    PRIMARY KEY (taxi_id, data_hora),
    FOREIGN KEY (taxi_id) REFERENCES taxis(id)
);

INSERT INTO trajetos (taxi_id, data_hora, latitude, longitude)
VALUES
    (2210, '2008-02-02 15:36:08', 116.51172, 39.92123),
    (1065, '2008-02-02 13:33:52', 116.36422, 39.88781),
    (7956, '2008-02-02 13:39:08', 116.35743, 39.88957),
    (252, '2008-02-02 15:15:04', 116.47002, 39.90666),
    (9557, '2008-02-02 13:43:04', 116.62934, 39.82726),
    (4485, '2008-02-02 13:40:36', 116.3636, 39.92648),
    (6418, '2008-02-02 15:10:26', 116.76038, 39.79758);
