package com.wellsfargo.counselor.entity;

import jakarta.persistence.GenerationType;

public @interface GeneratedValue {
    GenerationType strategy();
}
