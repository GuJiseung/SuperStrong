.class public Landroidx/recyclerview/widget/o;
.super Landroidx/recyclerview/widget/RecyclerView$w;
.source "SourceFile"


# instance fields
.field public final i:Landroid/view/animation/LinearInterpolator;

.field public final j:Landroid/view/animation/DecelerateInterpolator;

.field public k:Landroid/graphics/PointF;

.field public final l:Landroid/util/DisplayMetrics;

.field public m:Z

.field public n:F

.field public o:I

.field public p:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$w;-><init>()V

    new-instance v0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/o;->i:Landroid/view/animation/LinearInterpolator;

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/o;->j:Landroid/view/animation/DecelerateInterpolator;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/recyclerview/widget/o;->m:Z

    iput v0, p0, Landroidx/recyclerview/widget/o;->o:I

    iput v0, p0, Landroidx/recyclerview/widget/o;->p:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iput-object p1, p0, Landroidx/recyclerview/widget/o;->l:Landroid/util/DisplayMetrics;

    return-void
.end method

.method public static e(IIIII)I
    .locals 1

    const/4 v0, -0x1

    if-eq p4, v0, :cond_4

    if-eqz p4, :cond_1

    const/4 p0, 0x1

    if-ne p4, p0, :cond_0

    sub-int/2addr p3, p1

    return p3

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    sub-int/2addr p2, p0

    if-lez p2, :cond_2

    return p2

    :cond_2
    sub-int/2addr p3, p1

    if-gez p3, :cond_3

    return p3

    :cond_3
    const/4 p0, 0x0

    return p0

    :cond_4
    sub-int/2addr p2, p0

    return p2
.end method


# virtual methods
.method public c(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$w$a;)V
    .locals 10

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/o;->k:Landroid/graphics/PointF;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, -0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget v0, v0, Landroid/graphics/PointF;->x:F

    .line 10
    .line 11
    cmpl-float v0, v0, v3

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    if-lez v0, :cond_1

    .line 17
    .line 18
    move v0, v1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move v0, v2

    .line 21
    goto :goto_1

    .line 22
    :cond_2
    :goto_0
    move v0, v4

    .line 23
    :goto_1
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView$w;->c:Landroidx/recyclerview/widget/RecyclerView$l;

    .line 24
    .line 25
    if-eqz v5, :cond_4

    .line 26
    .line 27
    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView$l;->d()Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-nez v6, :cond_3

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    check-cast v6, Landroidx/recyclerview/widget/RecyclerView$m;

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView$l;->B(Landroid/view/View;)I

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    sub-int/2addr v7, v8

    .line 49
    iget v8, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 50
    .line 51
    sub-int/2addr v7, v8

    .line 52
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView$l;->I(Landroid/view/View;)I

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    add-int/2addr v9, v8

    .line 61
    iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 62
    .line 63
    add-int/2addr v9, v6

    .line 64
    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView$l;->D()I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    iget v8, v5, Landroidx/recyclerview/widget/RecyclerView$l;->n:I

    .line 69
    .line 70
    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView$l;->E()I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    sub-int/2addr v8, v5

    .line 75
    invoke-static {v7, v9, v6, v8, v0}, Landroidx/recyclerview/widget/o;->e(IIIII)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    goto :goto_3

    .line 80
    :cond_4
    :goto_2
    move v0, v4

    .line 81
    :goto_3
    iget-object v5, p0, Landroidx/recyclerview/widget/o;->k:Landroid/graphics/PointF;

    .line 82
    .line 83
    if-eqz v5, :cond_6

    .line 84
    .line 85
    iget v5, v5, Landroid/graphics/PointF;->y:F

    .line 86
    .line 87
    cmpl-float v3, v5, v3

    .line 88
    .line 89
    if-nez v3, :cond_5

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_5
    if-lez v3, :cond_7

    .line 93
    .line 94
    move v2, v1

    .line 95
    goto :goto_5

    .line 96
    :cond_6
    :goto_4
    move v2, v4

    .line 97
    :cond_7
    :goto_5
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView$w;->c:Landroidx/recyclerview/widget/RecyclerView$l;

    .line 98
    .line 99
    if-eqz v3, :cond_9

    .line 100
    .line 101
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$l;->e()Z

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    if-nez v5, :cond_8

    .line 106
    .line 107
    goto :goto_6

    .line 108
    :cond_8
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    check-cast v4, Landroidx/recyclerview/widget/RecyclerView$m;

    .line 113
    .line 114
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView$l;->K(Landroid/view/View;)I

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    sub-int/2addr v5, v6

    .line 123
    iget v6, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 124
    .line 125
    sub-int/2addr v5, v6

    .line 126
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView$l;->u(Landroid/view/View;)I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    add-int/2addr p1, v6

    .line 135
    iget v4, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 136
    .line 137
    add-int/2addr p1, v4

    .line 138
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$l;->F()I

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    iget v6, v3, Landroidx/recyclerview/widget/RecyclerView$l;->o:I

    .line 143
    .line 144
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$l;->C()I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    sub-int/2addr v6, v3

    .line 149
    invoke-static {v5, p1, v4, v6, v2}, Landroidx/recyclerview/widget/o;->e(IIIII)I

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    :cond_9
    :goto_6
    mul-int p1, v0, v0

    .line 154
    .line 155
    mul-int v2, v4, v4

    .line 156
    .line 157
    add-int/2addr v2, p1

    .line 158
    int-to-double v2, v2

    .line 159
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 160
    .line 161
    .line 162
    move-result-wide v2

    .line 163
    double-to-int p1, v2

    .line 164
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/o;->g(I)I

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    int-to-double v2, p1

    .line 169
    const-wide v5, 0x3fd57a786c22680aL    # 0.3356

    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    div-double/2addr v2, v5

    .line 175
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 176
    .line 177
    .line 178
    move-result-wide v2

    .line 179
    double-to-int p1, v2

    .line 180
    if-lez p1, :cond_a

    .line 181
    .line 182
    neg-int v0, v0

    .line 183
    neg-int v2, v4

    .line 184
    iget-object v3, p0, Landroidx/recyclerview/widget/o;->j:Landroid/view/animation/DecelerateInterpolator;

    .line 185
    .line 186
    iput v0, p2, Landroidx/recyclerview/widget/RecyclerView$w$a;->a:I

    .line 187
    .line 188
    iput v2, p2, Landroidx/recyclerview/widget/RecyclerView$w$a;->b:I

    .line 189
    .line 190
    iput p1, p2, Landroidx/recyclerview/widget/RecyclerView$w$a;->c:I

    .line 191
    .line 192
    iput-object v3, p2, Landroidx/recyclerview/widget/RecyclerView$w$a;->e:Landroid/view/animation/Interpolator;

    .line 193
    .line 194
    iput-boolean v1, p2, Landroidx/recyclerview/widget/RecyclerView$w$a;->f:Z

    .line 195
    .line 196
    :cond_a
    return-void
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

.method public f(Landroid/util/DisplayMetrics;)F
    .locals 1

    iget p1, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float p1, p1

    const/high16 v0, 0x41c80000    # 25.0f

    div-float/2addr v0, p1

    return v0
.end method

.method public g(I)I
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    iget-boolean v0, p0, Landroidx/recyclerview/widget/o;->m:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/recyclerview/widget/o;->l:Landroid/util/DisplayMetrics;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/o;->f(Landroid/util/DisplayMetrics;)F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput v0, p0, Landroidx/recyclerview/widget/o;->n:F

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Landroidx/recyclerview/widget/o;->m:Z

    .line 20
    .line 21
    :cond_0
    iget v0, p0, Landroidx/recyclerview/widget/o;->n:F

    .line 22
    .line 23
    mul-float/2addr p1, v0

    .line 24
    float-to-double v0, p1

    .line 25
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    double-to-int p1, v0

    .line 30
    return p1
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
.end method
