insert into department (name, slug, tagline, description, image_url) values
('Cardiology', 'cardiology', 'Heart & Vascular', 'Our cardiology team provides evaluation and treatment for heart and vascular conditions, from routine screenings and risk assessment to ongoing care for chronic heart disease.', '/assets/img/health/cardiology-2.jpg'),
('Neurology', 'neurology', 'Brain & Nervous System', 'Our neurologists diagnose and manage conditions affecting the brain, spine, and nervous system, including headaches, seizures, stroke, and movement disorders.', '/assets/img/health/neurology-3.jpg'),
('Orthopedics', 'orthopedics', 'Bones & Joints', 'We help patients recover from injuries and manage bone, joint, and muscle conditions with personalized treatment plans, rehabilitation, and orthopedic expertise.', '/assets/img/health/orthopedics-4.jpg'),
('Pediatrics', 'pediatrics', 'Children''s Health', 'Our pediatric team cares for infants, children, and adolescents with preventive checkups, vaccinations, treatment for common illnesses, and support for healthy development.', '/assets/img/health/pediatrics-2.jpg'),
('Laboratory', 'laboratory', 'Diagnostic Services', 'Our laboratory delivers accurate, timely testing to help physicians diagnose conditions, monitor treatment, and guide informed decisions about your care.', '/assets/img/health/laboratory-3.jpg'),
('Emergency', 'emergency', '24/7 Critical Care', 'Our emergency department is open around the clock for urgent illness and injury, providing rapid assessment, stabilization, and coordinated care when every minute matters.', '/assets/img/health/emergency-4.jpg');

insert into feature (name) values
('24/7 Emergency'), ('Advanced Diagnostics'),
('MRI Available'), ('Specialist Team'),
('Sports Medicine'), ('Joint Replacement'),
('Child-Friendly'), ('Vaccination Center'),
('Quick Results'), ('Digital Reports'),
('Round-the-Clock'), ('Trauma Center');

insert into department_feature (department_id, feature_id, position)
select d.id, f.id, v.position
from (values ('cardiology', '24/7 Emergency', 0),
             ('cardiology', 'Advanced Diagnostics', 1),
             ('neurology', 'MRI Available', 0),
             ('neurology', 'Specialist Team', 1),
             ('orthopedics', 'Sports Medicine', 0),
             ('orthopedics', 'Joint Replacement', 1),
             ('pediatrics', 'Child-Friendly', 0),
             ('pediatrics', 'Vaccination Center', 1),
             ('laboratory', 'Quick Results', 0),
             ('laboratory', 'Digital Reports', 1),
             ('emergency', 'Round-the-Clock', 0),
             ('emergency', 'Trauma Center', 1) 
) as v(slug, feature, position)
join department d on d.slug = v.slug
join feature f on f.name = v.feature;
