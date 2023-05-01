.class public abstract La2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "La2/a<",
        "TT;>;>",
        "Ljava/lang/Object;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# instance fields
.field public A:Z

.field public b:I

.field public c:F

.field public d:Lk1/l;

.field public e:Lcom/bumptech/glide/i;

.field public f:Landroid/graphics/drawable/Drawable;

.field public g:I

.field public h:Landroid/graphics/drawable/Drawable;

.field public i:I

.field public j:Z

.field public k:I

.field public l:I

.field public m:Li1/f;

.field public n:Z

.field public o:Z

.field public p:Landroid/graphics/drawable/Drawable;

.field public q:I

.field public r:Li1/h;

.field public s:Le2/b;

.field public t:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public u:Z

.field public v:Landroid/content/res/Resources$Theme;

.field public w:Z

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, La2/a;->c:F

    sget-object v0, Lk1/l;->c:Lk1/l$e;

    iput-object v0, p0, La2/a;->d:Lk1/l;

    sget-object v0, Lcom/bumptech/glide/i;->d:Lcom/bumptech/glide/i;

    iput-object v0, p0, La2/a;->e:Lcom/bumptech/glide/i;

    const/4 v0, 0x1

    iput-boolean v0, p0, La2/a;->j:Z

    const/4 v1, -0x1

    iput v1, p0, La2/a;->k:I

    iput v1, p0, La2/a;->l:I

    sget-object v1, Ld2/c;->b:Ld2/c;

    iput-object v1, p0, La2/a;->m:Li1/f;

    iput-boolean v0, p0, La2/a;->o:Z

    new-instance v1, Li1/h;

    invoke-direct {v1}, Li1/h;-><init>()V

    iput-object v1, p0, La2/a;->r:Li1/h;

    new-instance v1, Le2/b;

    invoke-direct {v1}, Le2/b;-><init>()V

    iput-object v1, p0, La2/a;->s:Le2/b;

    const-class v1, Ljava/lang/Object;

    iput-object v1, p0, La2/a;->t:Ljava/lang/Class;

    iput-boolean v0, p0, La2/a;->z:Z

    return-void
.end method

.method public static e(II)Z
    .locals 0

    and-int/2addr p0, p1

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public a(La2/a;)La2/a;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La2/a<",
            "*>;)TT;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, La2/a;->w:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, La2/a;->b()La2/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, La2/a;->a(La2/a;)La2/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    iget v0, p1, La2/a;->b:I

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    invoke-static {v0, v1}, La2/a;->e(II)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget v0, p1, La2/a;->c:F

    .line 24
    .line 25
    iput v0, p0, La2/a;->c:F

    .line 26
    .line 27
    :cond_1
    iget v0, p1, La2/a;->b:I

    .line 28
    .line 29
    const/high16 v1, 0x40000

    .line 30
    .line 31
    invoke-static {v0, v1}, La2/a;->e(II)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    iget-boolean v0, p1, La2/a;->x:Z

    .line 38
    .line 39
    iput-boolean v0, p0, La2/a;->x:Z

    .line 40
    .line 41
    :cond_2
    iget v0, p1, La2/a;->b:I

    .line 42
    .line 43
    const/high16 v1, 0x100000

    .line 44
    .line 45
    invoke-static {v0, v1}, La2/a;->e(II)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    iget-boolean v0, p1, La2/a;->A:Z

    .line 52
    .line 53
    iput-boolean v0, p0, La2/a;->A:Z

    .line 54
    .line 55
    :cond_3
    iget v0, p1, La2/a;->b:I

    .line 56
    .line 57
    const/4 v1, 0x4

    .line 58
    invoke-static {v0, v1}, La2/a;->e(II)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    iget-object v0, p1, La2/a;->d:Lk1/l;

    .line 65
    .line 66
    iput-object v0, p0, La2/a;->d:Lk1/l;

    .line 67
    .line 68
    :cond_4
    iget v0, p1, La2/a;->b:I

    .line 69
    .line 70
    const/16 v1, 0x8

    .line 71
    .line 72
    invoke-static {v0, v1}, La2/a;->e(II)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    iget-object v0, p1, La2/a;->e:Lcom/bumptech/glide/i;

    .line 79
    .line 80
    iput-object v0, p0, La2/a;->e:Lcom/bumptech/glide/i;

    .line 81
    .line 82
    :cond_5
    iget v0, p1, La2/a;->b:I

    .line 83
    .line 84
    const/16 v1, 0x10

    .line 85
    .line 86
    invoke-static {v0, v1}, La2/a;->e(II)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    const/4 v1, 0x0

    .line 91
    if-eqz v0, :cond_6

    .line 92
    .line 93
    iget-object v0, p1, La2/a;->f:Landroid/graphics/drawable/Drawable;

    .line 94
    .line 95
    iput-object v0, p0, La2/a;->f:Landroid/graphics/drawable/Drawable;

    .line 96
    .line 97
    iput v1, p0, La2/a;->g:I

    .line 98
    .line 99
    iget v0, p0, La2/a;->b:I

    .line 100
    .line 101
    and-int/lit8 v0, v0, -0x21

    .line 102
    .line 103
    iput v0, p0, La2/a;->b:I

    .line 104
    .line 105
    :cond_6
    iget v0, p1, La2/a;->b:I

    .line 106
    .line 107
    const/16 v2, 0x20

    .line 108
    .line 109
    invoke-static {v0, v2}, La2/a;->e(II)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    const/4 v2, 0x0

    .line 114
    if-eqz v0, :cond_7

    .line 115
    .line 116
    iget v0, p1, La2/a;->g:I

    .line 117
    .line 118
    iput v0, p0, La2/a;->g:I

    .line 119
    .line 120
    iput-object v2, p0, La2/a;->f:Landroid/graphics/drawable/Drawable;

    .line 121
    .line 122
    iget v0, p0, La2/a;->b:I

    .line 123
    .line 124
    and-int/lit8 v0, v0, -0x11

    .line 125
    .line 126
    iput v0, p0, La2/a;->b:I

    .line 127
    .line 128
    :cond_7
    iget v0, p1, La2/a;->b:I

    .line 129
    .line 130
    const/16 v3, 0x40

    .line 131
    .line 132
    invoke-static {v0, v3}, La2/a;->e(II)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_8

    .line 137
    .line 138
    iget-object v0, p1, La2/a;->h:Landroid/graphics/drawable/Drawable;

    .line 139
    .line 140
    iput-object v0, p0, La2/a;->h:Landroid/graphics/drawable/Drawable;

    .line 141
    .line 142
    iput v1, p0, La2/a;->i:I

    .line 143
    .line 144
    iget v0, p0, La2/a;->b:I

    .line 145
    .line 146
    and-int/lit16 v0, v0, -0x81

    .line 147
    .line 148
    iput v0, p0, La2/a;->b:I

    .line 149
    .line 150
    :cond_8
    iget v0, p1, La2/a;->b:I

    .line 151
    .line 152
    const/16 v3, 0x80

    .line 153
    .line 154
    invoke-static {v0, v3}, La2/a;->e(II)Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eqz v0, :cond_9

    .line 159
    .line 160
    iget v0, p1, La2/a;->i:I

    .line 161
    .line 162
    iput v0, p0, La2/a;->i:I

    .line 163
    .line 164
    iput-object v2, p0, La2/a;->h:Landroid/graphics/drawable/Drawable;

    .line 165
    .line 166
    iget v0, p0, La2/a;->b:I

    .line 167
    .line 168
    and-int/lit8 v0, v0, -0x41

    .line 169
    .line 170
    iput v0, p0, La2/a;->b:I

    .line 171
    .line 172
    :cond_9
    iget v0, p1, La2/a;->b:I

    .line 173
    .line 174
    const/16 v3, 0x100

    .line 175
    .line 176
    invoke-static {v0, v3}, La2/a;->e(II)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-eqz v0, :cond_a

    .line 181
    .line 182
    iget-boolean v0, p1, La2/a;->j:Z

    .line 183
    .line 184
    iput-boolean v0, p0, La2/a;->j:Z

    .line 185
    .line 186
    :cond_a
    iget v0, p1, La2/a;->b:I

    .line 187
    .line 188
    const/16 v3, 0x200

    .line 189
    .line 190
    invoke-static {v0, v3}, La2/a;->e(II)Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-eqz v0, :cond_b

    .line 195
    .line 196
    iget v0, p1, La2/a;->l:I

    .line 197
    .line 198
    iput v0, p0, La2/a;->l:I

    .line 199
    .line 200
    iget v0, p1, La2/a;->k:I

    .line 201
    .line 202
    iput v0, p0, La2/a;->k:I

    .line 203
    .line 204
    :cond_b
    iget v0, p1, La2/a;->b:I

    .line 205
    .line 206
    const/16 v3, 0x400

    .line 207
    .line 208
    invoke-static {v0, v3}, La2/a;->e(II)Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-eqz v0, :cond_c

    .line 213
    .line 214
    iget-object v0, p1, La2/a;->m:Li1/f;

    .line 215
    .line 216
    iput-object v0, p0, La2/a;->m:Li1/f;

    .line 217
    .line 218
    :cond_c
    iget v0, p1, La2/a;->b:I

    .line 219
    .line 220
    const/16 v3, 0x1000

    .line 221
    .line 222
    invoke-static {v0, v3}, La2/a;->e(II)Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-eqz v0, :cond_d

    .line 227
    .line 228
    iget-object v0, p1, La2/a;->t:Ljava/lang/Class;

    .line 229
    .line 230
    iput-object v0, p0, La2/a;->t:Ljava/lang/Class;

    .line 231
    .line 232
    :cond_d
    iget v0, p1, La2/a;->b:I

    .line 233
    .line 234
    const/16 v3, 0x2000

    .line 235
    .line 236
    invoke-static {v0, v3}, La2/a;->e(II)Z

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    if-eqz v0, :cond_e

    .line 241
    .line 242
    iget-object v0, p1, La2/a;->p:Landroid/graphics/drawable/Drawable;

    .line 243
    .line 244
    iput-object v0, p0, La2/a;->p:Landroid/graphics/drawable/Drawable;

    .line 245
    .line 246
    iput v1, p0, La2/a;->q:I

    .line 247
    .line 248
    iget v0, p0, La2/a;->b:I

    .line 249
    .line 250
    and-int/lit16 v0, v0, -0x4001

    .line 251
    .line 252
    iput v0, p0, La2/a;->b:I

    .line 253
    .line 254
    :cond_e
    iget v0, p1, La2/a;->b:I

    .line 255
    .line 256
    const/16 v3, 0x4000

    .line 257
    .line 258
    invoke-static {v0, v3}, La2/a;->e(II)Z

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    if-eqz v0, :cond_f

    .line 263
    .line 264
    iget v0, p1, La2/a;->q:I

    .line 265
    .line 266
    iput v0, p0, La2/a;->q:I

    .line 267
    .line 268
    iput-object v2, p0, La2/a;->p:Landroid/graphics/drawable/Drawable;

    .line 269
    .line 270
    iget v0, p0, La2/a;->b:I

    .line 271
    .line 272
    and-int/lit16 v0, v0, -0x2001

    .line 273
    .line 274
    iput v0, p0, La2/a;->b:I

    .line 275
    .line 276
    :cond_f
    iget v0, p1, La2/a;->b:I

    .line 277
    .line 278
    const v2, 0x8000

    .line 279
    .line 280
    .line 281
    invoke-static {v0, v2}, La2/a;->e(II)Z

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    if-eqz v0, :cond_10

    .line 286
    .line 287
    iget-object v0, p1, La2/a;->v:Landroid/content/res/Resources$Theme;

    .line 288
    .line 289
    iput-object v0, p0, La2/a;->v:Landroid/content/res/Resources$Theme;

    .line 290
    .line 291
    :cond_10
    iget v0, p1, La2/a;->b:I

    .line 292
    .line 293
    const/high16 v2, 0x10000

    .line 294
    .line 295
    invoke-static {v0, v2}, La2/a;->e(II)Z

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    if-eqz v0, :cond_11

    .line 300
    .line 301
    iget-boolean v0, p1, La2/a;->o:Z

    .line 302
    .line 303
    iput-boolean v0, p0, La2/a;->o:Z

    .line 304
    .line 305
    :cond_11
    iget v0, p1, La2/a;->b:I

    .line 306
    .line 307
    const/high16 v2, 0x20000

    .line 308
    .line 309
    invoke-static {v0, v2}, La2/a;->e(II)Z

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    if-eqz v0, :cond_12

    .line 314
    .line 315
    iget-boolean v0, p1, La2/a;->n:Z

    .line 316
    .line 317
    iput-boolean v0, p0, La2/a;->n:Z

    .line 318
    .line 319
    :cond_12
    iget v0, p1, La2/a;->b:I

    .line 320
    .line 321
    const/16 v2, 0x800

    .line 322
    .line 323
    invoke-static {v0, v2}, La2/a;->e(II)Z

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    if-eqz v0, :cond_13

    .line 328
    .line 329
    iget-object v0, p0, La2/a;->s:Le2/b;

    .line 330
    .line 331
    iget-object v2, p1, La2/a;->s:Le2/b;

    .line 332
    .line 333
    invoke-virtual {v0, v2}, Ll/b;->putAll(Ljava/util/Map;)V

    .line 334
    .line 335
    .line 336
    iget-boolean v0, p1, La2/a;->z:Z

    .line 337
    .line 338
    iput-boolean v0, p0, La2/a;->z:Z

    .line 339
    .line 340
    :cond_13
    iget v0, p1, La2/a;->b:I

    .line 341
    .line 342
    const/high16 v2, 0x80000

    .line 343
    .line 344
    invoke-static {v0, v2}, La2/a;->e(II)Z

    .line 345
    .line 346
    .line 347
    move-result v0

    .line 348
    if-eqz v0, :cond_14

    .line 349
    .line 350
    iget-boolean v0, p1, La2/a;->y:Z

    .line 351
    .line 352
    iput-boolean v0, p0, La2/a;->y:Z

    .line 353
    .line 354
    :cond_14
    iget-boolean v0, p0, La2/a;->o:Z

    .line 355
    .line 356
    if-nez v0, :cond_15

    .line 357
    .line 358
    iget-object v0, p0, La2/a;->s:Le2/b;

    .line 359
    .line 360
    invoke-virtual {v0}, Le2/b;->clear()V

    .line 361
    .line 362
    .line 363
    iget v0, p0, La2/a;->b:I

    .line 364
    .line 365
    and-int/lit16 v0, v0, -0x801

    .line 366
    .line 367
    iput-boolean v1, p0, La2/a;->n:Z

    .line 368
    .line 369
    const v1, -0x20001

    .line 370
    .line 371
    .line 372
    and-int/2addr v0, v1

    .line 373
    iput v0, p0, La2/a;->b:I

    .line 374
    .line 375
    const/4 v0, 0x1

    .line 376
    iput-boolean v0, p0, La2/a;->z:Z

    .line 377
    .line 378
    :cond_15
    iget v0, p0, La2/a;->b:I

    .line 379
    .line 380
    iget v1, p1, La2/a;->b:I

    .line 381
    .line 382
    or-int/2addr v0, v1

    .line 383
    iput v0, p0, La2/a;->b:I

    .line 384
    .line 385
    iget-object v0, p0, La2/a;->r:Li1/h;

    .line 386
    .line 387
    iget-object p1, p1, La2/a;->r:Li1/h;

    .line 388
    .line 389
    iget-object v0, v0, Li1/h;->b:Le2/b;

    .line 390
    .line 391
    iget-object p1, p1, Li1/h;->b:Le2/b;

    .line 392
    .line 393
    invoke-virtual {v0, p1}, Le2/b;->i(Ll/b;)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {p0}, La2/a;->i()V

    .line 397
    .line 398
    .line 399
    return-object p0
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
.end method

.method public b()La2/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, La2/a;

    .line 6
    .line 7
    new-instance v1, Li1/h;

    .line 8
    .line 9
    invoke-direct {v1}, Li1/h;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, v0, La2/a;->r:Li1/h;

    .line 13
    .line 14
    iget-object v2, p0, La2/a;->r:Li1/h;

    .line 15
    .line 16
    iget-object v1, v1, Li1/h;->b:Le2/b;

    .line 17
    .line 18
    iget-object v2, v2, Li1/h;->b:Le2/b;

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Le2/b;->i(Ll/b;)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Le2/b;

    .line 24
    .line 25
    invoke-direct {v1}, Le2/b;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v1, v0, La2/a;->s:Le2/b;

    .line 29
    .line 30
    iget-object v2, p0, La2/a;->s:Le2/b;

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ll/b;->putAll(Ljava/util/Map;)V

    .line 33
    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    iput-boolean v1, v0, La2/a;->u:Z

    .line 37
    .line 38
    iput-boolean v1, v0, La2/a;->w:Z
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    return-object v0

    .line 41
    :catch_0
    move-exception v0

    .line 42
    new-instance v1, Ljava/lang/RuntimeException;

    .line 43
    .line 44
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    throw v1
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method

.method public final c(Ljava/lang/Class;)La2/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)TT;"
        }
    .end annotation

    iget-boolean v0, p0, La2/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, La2/a;->b()La2/a;

    move-result-object v0

    invoke-virtual {v0, p1}, La2/a;->c(Ljava/lang/Class;)La2/a;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object p1, p0, La2/a;->t:Ljava/lang/Class;

    iget p1, p0, La2/a;->b:I

    or-int/lit16 p1, p1, 0x1000

    iput p1, p0, La2/a;->b:I

    invoke-virtual {p0}, La2/a;->i()V

    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, La2/a;->b()La2/a;

    move-result-object v0

    return-object v0
.end method

.method public final d(Lk1/l;)La2/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk1/l;",
            ")TT;"
        }
    .end annotation

    iget-boolean v0, p0, La2/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, La2/a;->b()La2/a;

    move-result-object v0

    invoke-virtual {v0, p1}, La2/a;->d(Lk1/l;)La2/a;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Landroidx/activity/k;->h(Ljava/lang/Object;)V

    iput-object p1, p0, La2/a;->d:Lk1/l;

    iget p1, p0, La2/a;->b:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, La2/a;->b:I

    invoke-virtual {p0}, La2/a;->i()V

    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, La2/a;

    if-eqz v0, :cond_0

    check-cast p1, La2/a;

    iget v0, p1, La2/a;->c:F

    iget v1, p0, La2/a;->c:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, La2/a;->g:I

    iget v1, p1, La2/a;->g:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, La2/a;->f:Landroid/graphics/drawable/Drawable;

    iget-object v1, p1, La2/a;->f:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, v1}, Le2/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, La2/a;->i:I

    iget v1, p1, La2/a;->i:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, La2/a;->h:Landroid/graphics/drawable/Drawable;

    iget-object v1, p1, La2/a;->h:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, v1}, Le2/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, La2/a;->q:I

    iget v1, p1, La2/a;->q:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, La2/a;->p:Landroid/graphics/drawable/Drawable;

    iget-object v1, p1, La2/a;->p:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, v1}, Le2/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, La2/a;->j:Z

    iget-boolean v1, p1, La2/a;->j:Z

    if-ne v0, v1, :cond_0

    iget v0, p0, La2/a;->k:I

    iget v1, p1, La2/a;->k:I

    if-ne v0, v1, :cond_0

    iget v0, p0, La2/a;->l:I

    iget v1, p1, La2/a;->l:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, La2/a;->n:Z

    iget-boolean v1, p1, La2/a;->n:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, La2/a;->o:Z

    iget-boolean v1, p1, La2/a;->o:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, La2/a;->x:Z

    iget-boolean v1, p1, La2/a;->x:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, La2/a;->y:Z

    iget-boolean v1, p1, La2/a;->y:Z

    if-ne v0, v1, :cond_0

    iget-object v0, p0, La2/a;->d:Lk1/l;

    iget-object v1, p1, La2/a;->d:Lk1/l;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La2/a;->e:Lcom/bumptech/glide/i;

    iget-object v1, p1, La2/a;->e:Lcom/bumptech/glide/i;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, La2/a;->r:Li1/h;

    iget-object v1, p1, La2/a;->r:Li1/h;

    invoke-virtual {v0, v1}, Li1/h;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La2/a;->s:Le2/b;

    iget-object v1, p1, La2/a;->s:Le2/b;

    invoke-virtual {v0, v1}, Ll/h;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La2/a;->t:Ljava/lang/Class;

    iget-object v1, p1, La2/a;->t:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La2/a;->m:Li1/f;

    iget-object v1, p1, La2/a;->m:Li1/f;

    invoke-static {v0, v1}, Le2/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La2/a;->v:Landroid/content/res/Resources$Theme;

    iget-object p1, p1, La2/a;->v:Landroid/content/res/Resources$Theme;

    invoke-static {v0, p1}, Le2/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final f(Lr1/l;Lr1/f;)La2/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, La2/a;->w:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, La2/a;->b()La2/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1, p2}, La2/a;->f(Lr1/l;Lr1/f;)La2/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    sget-object v0, Lr1/l;->f:Li1/g;

    .line 15
    .line 16
    invoke-static {p1}, Landroidx/activity/k;->h(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0, p1}, La2/a;->j(Li1/g;Ljava/lang/Object;)La2/a;

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-virtual {p0, p2, p1}, La2/a;->p(Li1/l;Z)La2/a;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
.end method

.method public final g(II)La2/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)TT;"
        }
    .end annotation

    iget-boolean v0, p0, La2/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, La2/a;->b()La2/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, La2/a;->g(II)La2/a;

    move-result-object p1

    return-object p1

    :cond_0
    iput p1, p0, La2/a;->l:I

    iput p2, p0, La2/a;->k:I

    iget p1, p0, La2/a;->b:I

    or-int/lit16 p1, p1, 0x200

    iput p1, p0, La2/a;->b:I

    invoke-virtual {p0}, La2/a;->i()V

    return-object p0
.end method

.method public final h()La2/a;
    .locals 2

    sget-object v0, Lcom/bumptech/glide/i;->e:Lcom/bumptech/glide/i;

    iget-boolean v1, p0, La2/a;->w:Z

    if-eqz v1, :cond_0

    invoke-virtual {p0}, La2/a;->b()La2/a;

    move-result-object v0

    invoke-virtual {v0}, La2/a;->h()La2/a;

    move-result-object v0

    return-object v0

    :cond_0
    iput-object v0, p0, La2/a;->e:Lcom/bumptech/glide/i;

    iget v0, p0, La2/a;->b:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, La2/a;->b:I

    invoke-virtual {p0}, La2/a;->i()V

    return-object p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget v0, p0, La2/a;->c:F

    .line 2
    .line 3
    sget-object v1, Le2/j;->a:[C

    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    add-int/lit16 v0, v0, 0x20f

    .line 10
    .line 11
    iget v1, p0, La2/a;->g:I

    .line 12
    .line 13
    mul-int/lit8 v0, v0, 0x1f

    .line 14
    .line 15
    add-int/2addr v0, v1

    .line 16
    iget-object v1, p0, La2/a;->f:Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    invoke-static {v0, v1}, Le2/j;->f(ILjava/lang/Object;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v1, p0, La2/a;->i:I

    .line 23
    .line 24
    mul-int/lit8 v0, v0, 0x1f

    .line 25
    .line 26
    add-int/2addr v0, v1

    .line 27
    iget-object v1, p0, La2/a;->h:Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    invoke-static {v0, v1}, Le2/j;->f(ILjava/lang/Object;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget v1, p0, La2/a;->q:I

    .line 34
    .line 35
    mul-int/lit8 v0, v0, 0x1f

    .line 36
    .line 37
    add-int/2addr v0, v1

    .line 38
    iget-object v1, p0, La2/a;->p:Landroid/graphics/drawable/Drawable;

    .line 39
    .line 40
    invoke-static {v0, v1}, Le2/j;->f(ILjava/lang/Object;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-boolean v1, p0, La2/a;->j:Z

    .line 45
    .line 46
    mul-int/lit8 v0, v0, 0x1f

    .line 47
    .line 48
    add-int/2addr v0, v1

    .line 49
    iget v1, p0, La2/a;->k:I

    .line 50
    .line 51
    mul-int/lit8 v0, v0, 0x1f

    .line 52
    .line 53
    add-int/2addr v0, v1

    .line 54
    iget v1, p0, La2/a;->l:I

    .line 55
    .line 56
    mul-int/lit8 v0, v0, 0x1f

    .line 57
    .line 58
    add-int/2addr v0, v1

    .line 59
    iget-boolean v1, p0, La2/a;->n:Z

    .line 60
    .line 61
    mul-int/lit8 v0, v0, 0x1f

    .line 62
    .line 63
    add-int/2addr v0, v1

    .line 64
    iget-boolean v1, p0, La2/a;->o:Z

    .line 65
    .line 66
    mul-int/lit8 v0, v0, 0x1f

    .line 67
    .line 68
    add-int/2addr v0, v1

    .line 69
    iget-boolean v1, p0, La2/a;->x:Z

    .line 70
    .line 71
    mul-int/lit8 v0, v0, 0x1f

    .line 72
    .line 73
    add-int/2addr v0, v1

    .line 74
    iget-boolean v1, p0, La2/a;->y:Z

    .line 75
    .line 76
    mul-int/lit8 v0, v0, 0x1f

    .line 77
    .line 78
    add-int/2addr v0, v1

    .line 79
    iget-object v1, p0, La2/a;->d:Lk1/l;

    .line 80
    .line 81
    invoke-static {v0, v1}, Le2/j;->f(ILjava/lang/Object;)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    iget-object v1, p0, La2/a;->e:Lcom/bumptech/glide/i;

    .line 86
    .line 87
    invoke-static {v0, v1}, Le2/j;->f(ILjava/lang/Object;)I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    iget-object v1, p0, La2/a;->r:Li1/h;

    .line 92
    .line 93
    invoke-static {v0, v1}, Le2/j;->f(ILjava/lang/Object;)I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    iget-object v1, p0, La2/a;->s:Le2/b;

    .line 98
    .line 99
    invoke-static {v0, v1}, Le2/j;->f(ILjava/lang/Object;)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    iget-object v1, p0, La2/a;->t:Ljava/lang/Class;

    .line 104
    .line 105
    invoke-static {v0, v1}, Le2/j;->f(ILjava/lang/Object;)I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    iget-object v1, p0, La2/a;->m:Li1/f;

    .line 110
    .line 111
    invoke-static {v0, v1}, Le2/j;->f(ILjava/lang/Object;)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    iget-object v1, p0, La2/a;->v:Landroid/content/res/Resources$Theme;

    .line 116
    .line 117
    invoke-static {v0, v1}, Le2/j;->f(ILjava/lang/Object;)I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    return v0
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method

.method public final i()V
    .locals 2

    iget-boolean v0, p0, La2/a;->u:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot modify locked T, consider clone()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final j(Li1/g;Ljava/lang/Object;)La2/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Y:",
            "Ljava/lang/Object;",
            ">(",
            "Li1/g<",
            "TY;>;TY;)TT;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, La2/a;->w:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, La2/a;->b()La2/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1, p2}, La2/a;->j(Li1/g;Ljava/lang/Object;)La2/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-static {p1}, Landroidx/activity/k;->h(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p2}, Landroidx/activity/k;->h(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, La2/a;->r:Li1/h;

    .line 21
    .line 22
    iget-object v0, v0, Li1/h;->b:Le2/b;

    .line 23
    .line 24
    invoke-virtual {v0, p1, p2}, Le2/b;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, La2/a;->i()V

    .line 28
    .line 29
    .line 30
    return-object p0
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
.end method

.method public final l(Li1/f;)La2/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li1/f;",
            ")TT;"
        }
    .end annotation

    iget-boolean v0, p0, La2/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, La2/a;->b()La2/a;

    move-result-object v0

    invoke-virtual {v0, p1}, La2/a;->l(Li1/f;)La2/a;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object p1, p0, La2/a;->m:Li1/f;

    iget p1, p0, La2/a;->b:I

    or-int/lit16 p1, p1, 0x400

    iput p1, p0, La2/a;->b:I

    invoke-virtual {p0}, La2/a;->i()V

    return-object p0
.end method

.method public final m()La2/a;
    .locals 1

    iget-boolean v0, p0, La2/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, La2/a;->b()La2/a;

    move-result-object v0

    invoke-virtual {v0}, La2/a;->m()La2/a;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, La2/a;->j:Z

    iget v0, p0, La2/a;->b:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, La2/a;->b:I

    invoke-virtual {p0}, La2/a;->i()V

    return-object p0
.end method

.method public final p(Li1/l;Z)La2/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li1/l<",
            "Landroid/graphics/Bitmap;",
            ">;Z)TT;"
        }
    .end annotation

    iget-boolean v0, p0, La2/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, La2/a;->b()La2/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, La2/a;->p(Li1/l;Z)La2/a;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lr1/o;

    invoke-direct {v0, p1, p2}, Lr1/o;-><init>(Li1/l;Z)V

    const-class v1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, v1, p1, p2}, La2/a;->q(Ljava/lang/Class;Li1/l;Z)La2/a;

    const-class v1, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v1, v0, p2}, La2/a;->q(Ljava/lang/Class;Li1/l;Z)La2/a;

    const-class v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0, v1, v0, p2}, La2/a;->q(Ljava/lang/Class;Li1/l;Z)La2/a;

    new-instance v0, Lv1/e;

    invoke-direct {v0, p1}, Lv1/e;-><init>(Li1/l;)V

    const-class p1, Lv1/c;

    invoke-virtual {p0, p1, v0, p2}, La2/a;->q(Ljava/lang/Class;Li1/l;Z)La2/a;

    invoke-virtual {p0}, La2/a;->i()V

    return-object p0
.end method

.method public final q(Ljava/lang/Class;Li1/l;Z)La2/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Y:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TY;>;",
            "Li1/l<",
            "TY;>;Z)TT;"
        }
    .end annotation

    iget-boolean v0, p0, La2/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, La2/a;->b()La2/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, La2/a;->q(Ljava/lang/Class;Li1/l;Z)La2/a;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p2}, Landroidx/activity/k;->h(Ljava/lang/Object;)V

    iget-object v0, p0, La2/a;->s:Le2/b;

    invoke-virtual {v0, p1, p2}, Le2/b;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget p1, p0, La2/a;->b:I

    or-int/lit16 p1, p1, 0x800

    const/4 p2, 0x1

    iput-boolean p2, p0, La2/a;->o:Z

    const/high16 v0, 0x10000

    or-int/2addr p1, v0

    iput p1, p0, La2/a;->b:I

    const/4 v0, 0x0

    iput-boolean v0, p0, La2/a;->z:Z

    if-eqz p3, :cond_1

    const/high16 p3, 0x20000

    or-int/2addr p1, p3

    iput p1, p0, La2/a;->b:I

    iput-boolean p2, p0, La2/a;->n:Z

    :cond_1
    invoke-virtual {p0}, La2/a;->i()V

    return-object p0
.end method

.method public final r()La2/a;
    .locals 2

    iget-boolean v0, p0, La2/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, La2/a;->b()La2/a;

    move-result-object v0

    invoke-virtual {v0}, La2/a;->r()La2/a;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, La2/a;->A:Z

    iget v0, p0, La2/a;->b:I

    const/high16 v1, 0x100000

    or-int/2addr v0, v1

    iput v0, p0, La2/a;->b:I

    invoke-virtual {p0}, La2/a;->i()V

    return-object p0
.end method
