.class public final Landroidx/constraintlayout/widget/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/widget/b$a;,
        Landroidx/constraintlayout/widget/b$c;,
        Landroidx/constraintlayout/widget/b$d;,
        Landroidx/constraintlayout/widget/b$e;,
        Landroidx/constraintlayout/widget/b$b;
    }
.end annotation


# static fields
.field public static final d:[I

.field public static final e:Landroid/util/SparseIntArray;

.field public static final f:Landroid/util/SparseIntArray;


# instance fields
.field public final a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lr/a;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Z

.field public final c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Landroidx/constraintlayout/widget/b$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    const/4 v0, 0x3

    new-array v1, v0, [I

    fill-array-data v1, :array_0

    sput-object v1, Landroidx/constraintlayout/widget/b;->d:[I

    new-instance v1, Landroid/util/SparseIntArray;

    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v1, Landroidx/constraintlayout/widget/b;->e:Landroid/util/SparseIntArray;

    new-instance v2, Landroid/util/SparseIntArray;

    invoke-direct {v2}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v2, Landroidx/constraintlayout/widget/b;->f:Landroid/util/SparseIntArray;

    const/16 v3, 0x19

    const/16 v4, 0x52

    invoke-virtual {v1, v4, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x1a

    const/16 v5, 0x53

    invoke-virtual {v1, v5, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x1d

    const/16 v6, 0x55

    invoke-virtual {v1, v6, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x56

    const/16 v7, 0x1e

    invoke-virtual {v1, v3, v7}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x5c

    const/16 v7, 0x24

    invoke-virtual {v1, v3, v7}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x5b

    const/16 v7, 0x23

    invoke-virtual {v1, v3, v7}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x3f

    const/4 v7, 0x4

    invoke-virtual {v1, v3, v7}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x3e

    invoke-virtual {v1, v3, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v3, 0x1

    const/16 v7, 0x3a

    invoke-virtual {v1, v7, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x5b

    const/16 v8, 0x3c

    invoke-virtual {v1, v8, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x5c

    const/16 v9, 0x3b

    invoke-virtual {v1, v9, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x65

    const/4 v10, 0x6

    invoke-virtual {v1, v3, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x66

    const/4 v11, 0x7

    invoke-virtual {v1, v3, v11}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x11

    const/16 v12, 0x46

    invoke-virtual {v1, v12, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x12

    const/16 v13, 0x47

    invoke-virtual {v1, v13, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x13

    const/16 v14, 0x48

    invoke-virtual {v1, v14, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x63

    const/16 v15, 0x36

    invoke-virtual {v1, v15, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v3, 0x0

    const/16 v6, 0x1b

    invoke-virtual {v1, v3, v6}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x20

    const/16 v6, 0x57

    invoke-virtual {v1, v6, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x58

    const/16 v5, 0x21

    invoke-virtual {v1, v3, v5}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0xa

    const/16 v5, 0x45

    invoke-virtual {v1, v5, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x9

    const/16 v4, 0x44

    invoke-virtual {v1, v4, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x6a

    const/16 v14, 0xd

    invoke-virtual {v1, v3, v14}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x6d

    const/16 v13, 0x10

    invoke-virtual {v1, v3, v13}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x6b

    const/16 v12, 0xe

    invoke-virtual {v1, v3, v12}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x68

    const/16 v5, 0xb

    invoke-virtual {v1, v3, v5}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x6c

    const/16 v5, 0xf

    invoke-virtual {v1, v3, v5}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x69

    const/16 v4, 0xc

    invoke-virtual {v1, v3, v4}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x28

    const/16 v4, 0x5f

    invoke-virtual {v1, v4, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x27

    const/16 v9, 0x50

    invoke-virtual {v1, v9, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x4f

    const/16 v9, 0x29

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x5e

    const/16 v9, 0x2a

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x4e

    const/16 v9, 0x14

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x5d

    const/16 v9, 0x25

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x43

    const/4 v9, 0x5

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x51

    invoke-virtual {v1, v3, v6}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x5a

    invoke-virtual {v1, v3, v6}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x54

    invoke-virtual {v1, v3, v6}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x3d

    invoke-virtual {v1, v3, v6}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x39

    invoke-virtual {v1, v3, v6}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v3, 0x5

    const/16 v9, 0x18

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x1c

    invoke-virtual {v1, v11, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x17

    const/16 v9, 0x1f

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x18

    const/16 v9, 0x8

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x22

    invoke-virtual {v1, v10, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x8

    const/4 v9, 0x2

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x17

    invoke-virtual {v1, v0, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v3, 0x4

    const/16 v9, 0x15

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x60

    invoke-virtual {v1, v3, v4}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x49

    const/16 v9, 0x60

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v3, 0x2

    const/16 v9, 0x16

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x2b

    invoke-virtual {v1, v14, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x1a

    const/16 v9, 0x2c

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x15

    const/16 v9, 0x2d

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x16

    const/16 v9, 0x2e

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x14

    invoke-virtual {v1, v3, v8}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x12

    const/16 v9, 0x2f

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x13

    const/16 v9, 0x30

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x31

    invoke-virtual {v1, v12, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x32

    invoke-virtual {v1, v5, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x33

    invoke-virtual {v1, v13, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x11

    const/16 v9, 0x34

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x19

    const/16 v9, 0x35

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x61

    invoke-virtual {v1, v3, v15}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x4a

    const/16 v9, 0x37

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x62

    const/16 v9, 0x38

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x4b

    const/16 v9, 0x39

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x63

    invoke-virtual {v1, v3, v7}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x4c

    const/16 v9, 0x3b

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x40

    const/16 v9, 0x3d

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x42

    const/16 v9, 0x3e

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x41

    const/16 v9, 0x3f

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x1c

    const/16 v9, 0x40

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x79

    const/16 v9, 0x41

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x23

    const/16 v9, 0x42

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x7a

    const/16 v9, 0x43

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x71

    const/16 v9, 0x4f

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v3, 0x1

    const/16 v9, 0x26

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x70

    const/16 v9, 0x44

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x64

    const/16 v9, 0x45

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x4d

    const/16 v9, 0x46

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x6f

    const/16 v9, 0x61

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x20

    const/16 v9, 0x47

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x1e

    const/16 v9, 0x48

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x1f

    const/16 v9, 0x49

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x21

    const/16 v9, 0x4a

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x1d

    const/16 v9, 0x4b

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x72

    const/16 v9, 0x4c

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x59

    const/16 v9, 0x4d

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x7b

    const/16 v9, 0x4e

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x38

    const/16 v9, 0x50

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x37

    const/16 v9, 0x51

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x74

    const/16 v9, 0x52

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x78

    const/16 v9, 0x53

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x77

    const/16 v9, 0x54

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x76

    const/16 v9, 0x55

    invoke-virtual {v1, v3, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x75

    const/16 v7, 0x56

    invoke-virtual {v1, v3, v7}, Landroid/util/SparseIntArray;->append(II)V

    invoke-virtual {v2, v9, v10}, Landroid/util/SparseIntArray;->append(II)V

    invoke-virtual {v2, v9, v11}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v1, 0x0

    const/16 v3, 0x1b

    invoke-virtual {v2, v1, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x59

    invoke-virtual {v2, v1, v14}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x5c

    invoke-virtual {v2, v1, v13}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x5a

    invoke-virtual {v2, v1, v12}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0xb

    invoke-virtual {v2, v6, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x5b

    invoke-virtual {v2, v1, v5}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x58

    const/16 v3, 0xc

    invoke-virtual {v2, v1, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x4e

    const/16 v3, 0x28

    invoke-virtual {v2, v1, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x27

    const/16 v3, 0x47

    invoke-virtual {v2, v3, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x29

    const/16 v3, 0x46

    invoke-virtual {v2, v3, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x4d

    const/16 v3, 0x2a

    invoke-virtual {v2, v1, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x14

    const/16 v3, 0x45

    invoke-virtual {v2, v3, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x4c

    const/16 v3, 0x25

    invoke-virtual {v2, v1, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v1, 0x5

    invoke-virtual {v2, v8, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x48

    invoke-virtual {v2, v1, v6}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x4b

    invoke-virtual {v2, v1, v6}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x49

    invoke-virtual {v2, v1, v6}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x39

    invoke-virtual {v2, v1, v6}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x38

    invoke-virtual {v2, v1, v6}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v1, 0x5

    const/16 v3, 0x18

    invoke-virtual {v2, v1, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x1c

    invoke-virtual {v2, v11, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x17

    const/16 v3, 0x1f

    invoke-virtual {v2, v1, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x18

    const/16 v3, 0x8

    invoke-virtual {v2, v1, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x22

    invoke-virtual {v2, v10, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x8

    const/4 v3, 0x2

    invoke-virtual {v2, v1, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x17

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v0, 0x4

    const/16 v1, 0x15

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x4f

    invoke-virtual {v2, v0, v4}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x40

    const/16 v1, 0x60

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v0, 0x2

    const/16 v1, 0x16

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x2b

    invoke-virtual {v2, v14, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x1a

    const/16 v1, 0x2c

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x15

    const/16 v1, 0x2d

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x16

    const/16 v1, 0x2e

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x14

    invoke-virtual {v2, v0, v8}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x12

    const/16 v1, 0x2f

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x13

    const/16 v1, 0x30

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x31

    invoke-virtual {v2, v12, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x32

    invoke-virtual {v2, v5, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x33

    invoke-virtual {v2, v13, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x11

    const/16 v1, 0x34

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x19

    const/16 v1, 0x35

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x50

    invoke-virtual {v2, v0, v15}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x41

    const/16 v1, 0x37

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x51

    const/16 v1, 0x38

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x42

    const/16 v1, 0x39

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x52

    const/16 v1, 0x3a

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x43

    const/16 v3, 0x3b

    invoke-virtual {v2, v0, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x3e

    invoke-virtual {v2, v3, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x3f

    invoke-virtual {v2, v1, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x1c

    const/16 v1, 0x40

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x69

    const/16 v1, 0x41

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x22

    const/16 v1, 0x42

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x6a

    const/16 v1, 0x43

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x60

    const/16 v1, 0x4f

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v0, 0x1

    const/16 v1, 0x26

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x61

    const/16 v1, 0x62

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x44

    invoke-virtual {v2, v4, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x53

    const/16 v3, 0x45

    invoke-virtual {v2, v1, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x46

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x20

    const/16 v1, 0x47

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x1e

    const/16 v1, 0x48

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x1f

    const/16 v1, 0x49

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x21

    const/16 v1, 0x4a

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x1d

    const/16 v1, 0x4b

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x62

    const/16 v1, 0x4c

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x4a

    const/16 v1, 0x4d

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x6b

    const/16 v1, 0x4e

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x37

    const/16 v1, 0x50

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x51

    invoke-virtual {v2, v15, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x64

    const/16 v1, 0x52

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x68

    const/16 v1, 0x53

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x67

    const/16 v1, 0x54

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x66

    const/16 v1, 0x55

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x65

    const/16 v1, 0x56

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x5e

    const/16 v1, 0x61

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    return-void

    :array_0
    .array-data 4
        0x0
        0x4
        0x8
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/b;->a:Ljava/util/HashMap;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/constraintlayout/widget/b;->b:Z

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/b;->c:Ljava/util/HashMap;

    return-void
.end method

.method public static d(Landroidx/constraintlayout/widget/Barrier;Ljava/lang/String;)[I
    .locals 10

    .line 1
    const-string v0, ","

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    array-length v1, p1

    .line 12
    new-array v1, v1, [I

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    move v4, v3

    .line 17
    :goto_0
    array-length v5, p1

    .line 18
    if-ge v3, v5, :cond_3

    .line 19
    .line 20
    aget-object v5, p1, v3

    .line 21
    .line 22
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    const/4 v6, 0x0

    .line 27
    :try_start_0
    const-class v7, Lr/d;

    .line 28
    .line 29
    invoke-virtual {v7, v5}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    invoke-virtual {v7, v6}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    .line 34
    .line 35
    .line 36
    move-result v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    goto :goto_1

    .line 38
    :catch_0
    move v7, v2

    .line 39
    :goto_1
    if-nez v7, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    const-string v8, "id"

    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    invoke-virtual {v7, v5, v8, v9}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    :cond_0
    if-nez v7, :cond_2

    .line 56
    .line 57
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    if-eqz v8, :cond_2

    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    instance-of v8, v8, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 68
    .line 69
    if-eqz v8, :cond_2

    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    check-cast v8, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 76
    .line 77
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    instance-of v9, v5, Ljava/lang/String;

    .line 81
    .line 82
    if-eqz v9, :cond_1

    .line 83
    .line 84
    iget-object v9, v8, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    .line 85
    .line 86
    if-eqz v9, :cond_1

    .line 87
    .line 88
    invoke-virtual {v9, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    if-eqz v9, :cond_1

    .line 93
    .line 94
    iget-object v6, v8, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    .line 95
    .line 96
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    :cond_1
    if-eqz v6, :cond_2

    .line 101
    .line 102
    instance-of v5, v6, Ljava/lang/Integer;

    .line 103
    .line 104
    if-eqz v5, :cond_2

    .line 105
    .line 106
    check-cast v6, Ljava/lang/Integer;

    .line 107
    .line 108
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    :cond_2
    add-int/lit8 v5, v4, 0x1

    .line 113
    .line 114
    aput v7, v1, v4

    .line 115
    .line 116
    add-int/lit8 v3, v3, 0x1

    .line 117
    .line 118
    move v4, v5

    .line 119
    goto :goto_0

    .line 120
    :cond_3
    array-length p0, p1

    .line 121
    if-eq v4, p0, :cond_4

    .line 122
    .line 123
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([II)[I

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    :cond_4
    return-object v1
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

.method public static e(Landroid/content/Context;Landroid/util/AttributeSet;Z)Landroidx/constraintlayout/widget/b$a;
    .locals 20

    new-instance v0, Landroidx/constraintlayout/widget/b$a;

    invoke-direct {v0}, Landroidx/constraintlayout/widget/b$a;-><init>()V

    if-eqz p2, :cond_0

    sget-object v1, Lc/a;->d:[I

    goto :goto_0

    :cond_0
    sget-object v1, Lc/a;->b:[I

    :goto_0
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    invoke-virtual {v2, v3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 1
    sget-object v2, Ln/a;->b:[Ljava/lang/String;

    sget-object v3, Landroidx/constraintlayout/widget/b;->d:[I

    sget-object v4, Landroidx/constraintlayout/widget/b;->e:Landroid/util/SparseIntArray;

    iget-object v12, v0, Landroidx/constraintlayout/widget/b$a;->b:Landroidx/constraintlayout/widget/b$d;

    iget-object v13, v0, Landroidx/constraintlayout/widget/b$a;->e:Landroidx/constraintlayout/widget/b$e;

    iget-object v14, v0, Landroidx/constraintlayout/widget/b$a;->c:Landroidx/constraintlayout/widget/b$c;

    iget-object v15, v0, Landroidx/constraintlayout/widget/b$a;->d:Landroidx/constraintlayout/widget/b$b;

    const-string v5, "/"

    const-string v6, "unused attribute 0x"

    const-string v10, "CURRENTLY UNSUPPORTED"

    const-string v7, "Unknown attribute 0x"

    const-string v8, "   "

    const-string v11, "ConstraintSet"

    if-eqz p2, :cond_7

    .line 2
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v9

    move-object/from16 v16, v7

    new-instance v7, Landroidx/constraintlayout/widget/b$a$a;

    invoke-direct {v7}, Landroidx/constraintlayout/widget/b$a$a;-><init>()V

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v17, v3

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v9, :cond_f

    move/from16 p2, v9

    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v9

    move/from16 v18, v3

    sget-object v3, Landroidx/constraintlayout/widget/b;->f:Landroid/util/SparseIntArray;

    invoke-virtual {v3, v9}, Landroid/util/SparseIntArray;->get(I)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    :pswitch_0
    move-object/from16 v19, v2

    new-instance v2, Ljava/lang/StringBuilder;

    move-object/from16 v3, v16

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v16, v7

    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Landroid/util/SparseIntArray;->get(I)I

    move-result v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v11, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_b

    :pswitch_1
    iget-boolean v3, v15, Landroidx/constraintlayout/widget/b$b;->g:Z

    invoke-virtual {v1, v9, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    const/16 v9, 0x63

    move-object/from16 v19, v2

    goto/16 :goto_4

    :pswitch_2
    sget v3, Lq/d;->L:I

    invoke-virtual {v1, v9}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v3

    iget v3, v3, Landroid/util/TypedValue;->type:I

    move-object/from16 v19, v2

    const/4 v2, 0x3

    if-ne v3, v2, :cond_1

    invoke-virtual {v1, v9}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    goto/16 :goto_a

    :cond_1
    iget v2, v0, Landroidx/constraintlayout/widget/b$a;->a:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, v0, Landroidx/constraintlayout/widget/b$a;->a:I

    goto/16 :goto_a

    :pswitch_3
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->o0:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    const/16 v3, 0x61

    goto/16 :goto_9

    :pswitch_4
    move-object/from16 v19, v2

    const/4 v2, 0x1

    goto :goto_2

    :pswitch_5
    move-object/from16 v19, v2

    const/4 v2, 0x0

    :goto_2
    invoke-static {v7, v1, v9, v2}, Landroidx/constraintlayout/widget/b;->h(Ljava/lang/Object;Landroid/content/res/TypedArray;II)V

    goto/16 :goto_a

    :pswitch_6
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->S:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    const/16 v3, 0x5e

    goto/16 :goto_9

    :pswitch_7
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->L:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    const/16 v3, 0x5d

    goto/16 :goto_9

    :pswitch_8
    move-object/from16 v19, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Landroid/util/SparseIntArray;->get(I)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v11, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_a

    :pswitch_9
    move-object/from16 v19, v2

    invoke-virtual {v1, v9}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v2

    iget v2, v2, Landroid/util/TypedValue;->type:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_2

    const/4 v3, -0x1

    invoke-virtual {v1, v9, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, v14, Landroidx/constraintlayout/widget/b$c;->i:I

    const/16 v9, 0x59

    invoke-virtual {v7, v9, v2}, Landroidx/constraintlayout/widget/b$a$a;->b(II)V

    iget v2, v14, Landroidx/constraintlayout/widget/b$c;->i:I

    if-eq v2, v3, :cond_6

    move v2, v3

    goto :goto_3

    :cond_2
    const/4 v3, 0x3

    if-ne v2, v3, :cond_4

    invoke-virtual {v1, v9}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v14, Landroidx/constraintlayout/widget/b$c;->h:Ljava/lang/String;

    const/16 v3, 0x5a

    invoke-virtual {v7, v2, v3}, Landroidx/constraintlayout/widget/b$a$a;->d(Ljava/lang/String;I)V

    iget-object v2, v14, Landroidx/constraintlayout/widget/b$c;->h:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    if-lez v2, :cond_3

    const/4 v2, -0x1

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    iput v3, v14, Landroidx/constraintlayout/widget/b$c;->i:I

    const/16 v9, 0x59

    invoke-virtual {v7, v9, v3}, Landroidx/constraintlayout/widget/b$a$a;->b(II)V

    :goto_3
    const/4 v3, -0x2

    const/16 v9, 0x58

    invoke-virtual {v7, v9, v3}, Landroidx/constraintlayout/widget/b$a$a;->b(II)V

    goto/16 :goto_a

    :cond_3
    const/4 v2, -0x1

    const/16 v9, 0x58

    invoke-virtual {v7, v9, v2}, Landroidx/constraintlayout/widget/b$a$a;->b(II)V

    goto/16 :goto_a

    :cond_4
    const/16 v2, 0x58

    iget v3, v14, Landroidx/constraintlayout/widget/b$c;->i:I

    invoke-virtual {v1, v9, v3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v3

    invoke-virtual {v7, v2, v3}, Landroidx/constraintlayout/widget/b$a$a;->b(II)V

    goto/16 :goto_a

    :pswitch_a
    move-object/from16 v19, v2

    iget v2, v14, Landroidx/constraintlayout/widget/b$c;->f:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    const/16 v3, 0x55

    goto/16 :goto_7

    :pswitch_b
    move-object/from16 v19, v2

    iget v2, v14, Landroidx/constraintlayout/widget/b$c;->g:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v2

    const/16 v3, 0x54

    goto/16 :goto_9

    :pswitch_c
    move-object/from16 v19, v2

    iget v2, v13, Landroidx/constraintlayout/widget/b$e;->h:I

    invoke-static {v1, v9, v2}, Landroidx/constraintlayout/widget/b;->g(Landroid/content/res/TypedArray;II)I

    move-result v2

    const/16 v3, 0x53

    goto/16 :goto_9

    :pswitch_d
    move-object/from16 v19, v2

    iget v2, v14, Landroidx/constraintlayout/widget/b$c;->b:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v2

    const/16 v3, 0x52

    goto/16 :goto_9

    :pswitch_e
    move-object/from16 v19, v2

    iget-boolean v2, v15, Landroidx/constraintlayout/widget/b$b;->m0:Z

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    const/16 v9, 0x51

    goto :goto_4

    :pswitch_f
    move-object/from16 v19, v2

    iget-boolean v2, v15, Landroidx/constraintlayout/widget/b$b;->l0:Z

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    const/16 v9, 0x50

    goto :goto_4

    :pswitch_10
    move-object/from16 v19, v2

    iget v2, v14, Landroidx/constraintlayout/widget/b$c;->d:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    const/16 v3, 0x4f

    goto/16 :goto_7

    :pswitch_11
    move-object/from16 v19, v2

    iget v2, v12, Landroidx/constraintlayout/widget/b$d;->b:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    const/16 v3, 0x4e

    goto/16 :goto_9

    :pswitch_12
    move-object/from16 v19, v2

    const/16 v2, 0x4d

    goto/16 :goto_8

    :pswitch_13
    move-object/from16 v19, v2

    iget v2, v14, Landroidx/constraintlayout/widget/b$c;->c:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    const/16 v3, 0x4c

    goto/16 :goto_9

    :pswitch_14
    move-object/from16 v19, v2

    iget-boolean v2, v15, Landroidx/constraintlayout/widget/b$b;->n0:Z

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    const/16 v9, 0x4b

    :goto_4
    invoke-virtual {v7, v9, v3}, Landroidx/constraintlayout/widget/b$a$a;->c(IZ)V

    goto/16 :goto_a

    :pswitch_15
    move-object/from16 v19, v2

    const/16 v2, 0x4a

    goto/16 :goto_8

    :pswitch_16
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->g0:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    const/16 v3, 0x49

    goto/16 :goto_9

    :pswitch_17
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->f0:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    const/16 v3, 0x48

    goto/16 :goto_9

    :pswitch_18
    move-object/from16 v19, v2

    invoke-static {v11, v10}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_a

    :pswitch_19
    move-object/from16 v19, v2

    const/16 v2, 0x46

    goto :goto_5

    :pswitch_1a
    move-object/from16 v19, v2

    const/16 v2, 0x45

    :goto_5
    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v1, v9, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v9

    invoke-virtual {v7, v2, v9}, Landroidx/constraintlayout/widget/b$a$a;->a(IF)V

    goto/16 :goto_a

    :pswitch_1b
    move-object/from16 v19, v2

    iget v2, v12, Landroidx/constraintlayout/widget/b$d;->d:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    const/16 v3, 0x44

    goto/16 :goto_7

    :pswitch_1c
    move-object/from16 v19, v2

    iget v2, v14, Landroidx/constraintlayout/widget/b$c;->e:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    const/16 v3, 0x43

    goto/16 :goto_7

    :pswitch_1d
    move-object/from16 v19, v2

    const/16 v2, 0x42

    const/4 v3, 0x0

    invoke-virtual {v1, v9, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v9

    invoke-virtual {v7, v2, v9}, Landroidx/constraintlayout/widget/b$a$a;->b(II)V

    goto/16 :goto_a

    :pswitch_1e
    move-object/from16 v19, v2

    const/4 v3, 0x0

    invoke-virtual {v1, v9}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v2

    iget v2, v2, Landroid/util/TypedValue;->type:I

    const/4 v3, 0x3

    if-ne v2, v3, :cond_5

    invoke-virtual {v1, v9}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_6

    :cond_5
    const/4 v2, 0x0

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v3

    aget-object v2, v19, v3

    :goto_6
    const/16 v3, 0x41

    invoke-virtual {v7, v2, v3}, Landroidx/constraintlayout/widget/b$a$a;->d(Ljava/lang/String;I)V

    goto/16 :goto_a

    :pswitch_1f
    move-object/from16 v19, v2

    iget v2, v14, Landroidx/constraintlayout/widget/b$c;->a:I

    invoke-static {v1, v9, v2}, Landroidx/constraintlayout/widget/b;->g(Landroid/content/res/TypedArray;II)I

    move-result v2

    const/16 v3, 0x40

    goto/16 :goto_9

    :pswitch_20
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->B:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    const/16 v3, 0x3f

    goto/16 :goto_7

    :pswitch_21
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->A:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    const/16 v3, 0x3e

    goto/16 :goto_9

    :pswitch_22
    move-object/from16 v19, v2

    iget v2, v13, Landroidx/constraintlayout/widget/b$e;->a:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    const/16 v3, 0x3c

    goto/16 :goto_7

    :pswitch_23
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->c0:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    const/16 v3, 0x3b

    goto/16 :goto_9

    :pswitch_24
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->b0:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    const/16 v3, 0x3a

    goto/16 :goto_9

    :pswitch_25
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->a0:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    const/16 v3, 0x39

    goto/16 :goto_9

    :pswitch_26
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->Z:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    const/16 v3, 0x38

    goto/16 :goto_9

    :pswitch_27
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->Y:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    const/16 v3, 0x37

    goto/16 :goto_9

    :pswitch_28
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->X:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    const/16 v3, 0x36

    goto/16 :goto_9

    :pswitch_29
    move-object/from16 v19, v2

    iget v2, v13, Landroidx/constraintlayout/widget/b$e;->k:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    const/16 v3, 0x35

    goto/16 :goto_7

    :pswitch_2a
    move-object/from16 v19, v2

    iget v2, v13, Landroidx/constraintlayout/widget/b$e;->j:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    const/16 v3, 0x34

    goto/16 :goto_7

    :pswitch_2b
    move-object/from16 v19, v2

    iget v2, v13, Landroidx/constraintlayout/widget/b$e;->i:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    const/16 v3, 0x33

    goto/16 :goto_7

    :pswitch_2c
    move-object/from16 v19, v2

    iget v2, v13, Landroidx/constraintlayout/widget/b$e;->g:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    const/16 v3, 0x32

    goto/16 :goto_7

    :pswitch_2d
    move-object/from16 v19, v2

    iget v2, v13, Landroidx/constraintlayout/widget/b$e;->f:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    const/16 v3, 0x31

    goto/16 :goto_7

    :pswitch_2e
    move-object/from16 v19, v2

    iget v2, v13, Landroidx/constraintlayout/widget/b$e;->e:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    const/16 v3, 0x30

    goto/16 :goto_7

    :pswitch_2f
    move-object/from16 v19, v2

    iget v2, v13, Landroidx/constraintlayout/widget/b$e;->d:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    const/16 v3, 0x2f

    goto/16 :goto_7

    :pswitch_30
    move-object/from16 v19, v2

    iget v2, v13, Landroidx/constraintlayout/widget/b$e;->c:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    const/16 v3, 0x2e

    goto/16 :goto_7

    :pswitch_31
    move-object/from16 v19, v2

    iget v2, v13, Landroidx/constraintlayout/widget/b$e;->b:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    const/16 v3, 0x2d

    goto/16 :goto_7

    :pswitch_32
    move-object/from16 v19, v2

    const/16 v2, 0x2c

    const/4 v3, 0x1

    invoke-virtual {v7, v2, v3}, Landroidx/constraintlayout/widget/b$a$a;->c(IZ)V

    iget v3, v13, Landroidx/constraintlayout/widget/b$e;->m:F

    invoke-virtual {v1, v9, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    invoke-virtual {v7, v2, v3}, Landroidx/constraintlayout/widget/b$a$a;->a(IF)V

    goto/16 :goto_a

    :pswitch_33
    move-object/from16 v19, v2

    iget v2, v12, Landroidx/constraintlayout/widget/b$d;->c:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    const/16 v3, 0x2b

    goto/16 :goto_7

    :pswitch_34
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->W:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    const/16 v3, 0x2a

    goto/16 :goto_9

    :pswitch_35
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->V:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    const/16 v3, 0x29

    goto/16 :goto_9

    :pswitch_36
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->T:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    const/16 v3, 0x28

    goto/16 :goto_7

    :pswitch_37
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->U:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    const/16 v3, 0x27

    goto/16 :goto_7

    :pswitch_38
    move-object/from16 v19, v2

    iget v2, v0, Landroidx/constraintlayout/widget/b$a;->a:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, v0, Landroidx/constraintlayout/widget/b$a;->a:I

    const/16 v3, 0x26

    goto/16 :goto_9

    :pswitch_39
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->x:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    const/16 v3, 0x25

    goto/16 :goto_7

    :pswitch_3a
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->H:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    const/16 v3, 0x22

    goto/16 :goto_9

    :pswitch_3b
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->K:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    const/16 v3, 0x1f

    goto/16 :goto_9

    :pswitch_3c
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->G:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    const/16 v3, 0x1c

    goto/16 :goto_9

    :pswitch_3d
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->E:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    const/16 v3, 0x1b

    goto/16 :goto_9

    :pswitch_3e
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->F:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    const/16 v3, 0x18

    goto/16 :goto_9

    :pswitch_3f
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->b:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v2

    const/16 v3, 0x17

    goto/16 :goto_9

    :pswitch_40
    move-object/from16 v19, v2

    iget v2, v12, Landroidx/constraintlayout/widget/b$d;->a:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    aget v2, v17, v2

    const/16 v3, 0x16

    goto/16 :goto_9

    :pswitch_41
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->c:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v2

    const/16 v3, 0x15

    goto/16 :goto_9

    :pswitch_42
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->w:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    const/16 v3, 0x14

    goto :goto_7

    :pswitch_43
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->f:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    const/16 v3, 0x13

    :goto_7
    invoke-virtual {v7, v3, v2}, Landroidx/constraintlayout/widget/b$a$a;->a(IF)V

    goto/16 :goto_a

    :pswitch_44
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->e:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    const/16 v3, 0x12

    goto/16 :goto_9

    :pswitch_45
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->d:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    const/16 v3, 0x11

    goto/16 :goto_9

    :pswitch_46
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->N:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    const/16 v3, 0x10

    goto/16 :goto_9

    :pswitch_47
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->R:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    const/16 v3, 0xf

    goto :goto_9

    :pswitch_48
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->O:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    const/16 v3, 0xe

    goto :goto_9

    :pswitch_49
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->M:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    const/16 v3, 0xd

    goto :goto_9

    :pswitch_4a
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->Q:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    const/16 v3, 0xc

    goto :goto_9

    :pswitch_4b
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->P:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    const/16 v3, 0xb

    goto :goto_9

    :pswitch_4c
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->J:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    const/16 v3, 0x8

    goto :goto_9

    :pswitch_4d
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->D:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    const/4 v3, 0x7

    goto :goto_9

    :pswitch_4e
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->C:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    const/4 v3, 0x6

    goto :goto_9

    :pswitch_4f
    move-object/from16 v19, v2

    const/4 v2, 0x5

    :goto_8
    invoke-virtual {v1, v9}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7, v3, v2}, Landroidx/constraintlayout/widget/b$a$a;->d(Ljava/lang/String;I)V

    goto :goto_a

    :pswitch_50
    move-object/from16 v19, v2

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->I:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    const/4 v3, 0x2

    :goto_9
    invoke-virtual {v7, v3, v2}, Landroidx/constraintlayout/widget/b$a$a;->b(II)V

    :cond_6
    :goto_a
    move-object/from16 v3, v16

    move-object/from16 v16, v7

    :goto_b
    add-int/lit8 v2, v18, 0x1

    move/from16 v9, p2

    move-object/from16 v7, v16

    move-object/from16 v16, v3

    move v3, v2

    move-object/from16 v2, v19

    goto/16 :goto_1

    :cond_7
    move-object/from16 v19, v2

    move-object/from16 v17, v3

    move-object v3, v7

    .line 3
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v2

    const/4 v7, 0x0

    :goto_c
    if-ge v7, v2, :cond_e

    invoke-virtual {v1, v7}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v9

    move/from16 p2, v2

    const/4 v2, 0x1

    if-eq v9, v2, :cond_8

    const/16 v2, 0x17

    if-eq v2, v9, :cond_8

    const/16 v2, 0x18

    if-eq v2, v9, :cond_9

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_d

    :cond_8
    const/16 v2, 0x18

    :cond_9
    :goto_d
    invoke-virtual {v4, v9}, Landroid/util/SparseIntArray;->get(I)I

    move-result v16

    packed-switch v16, :pswitch_data_1

    :pswitch_51
    move-object/from16 v16, v6

    const/4 v6, 0x0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Landroid/util/SparseIntArray;->get(I)I

    move-result v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v11, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_12

    :pswitch_52
    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->o0:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->o0:I

    goto :goto_f

    :pswitch_53
    const/4 v2, 0x1

    goto :goto_e

    :pswitch_54
    const/4 v2, 0x0

    :goto_e
    invoke-static {v15, v1, v9, v2}, Landroidx/constraintlayout/widget/b;->h(Ljava/lang/Object;Landroid/content/res/TypedArray;II)V

    goto :goto_f

    :pswitch_55
    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->S:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->S:I

    goto :goto_f

    :pswitch_56
    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->L:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->L:I

    goto :goto_f

    :pswitch_57
    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->r:I

    invoke-static {v1, v9, v2}, Landroidx/constraintlayout/widget/b;->g(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->r:I

    goto :goto_f

    :pswitch_58
    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->q:I

    invoke-static {v1, v9, v2}, Landroidx/constraintlayout/widget/b;->g(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->q:I

    :goto_f
    move-object/from16 v16, v6

    goto :goto_10

    :pswitch_59
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v16, v6

    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Landroid/util/SparseIntArray;->get(I)I

    move-result v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v11, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_10
    const/4 v6, -0x1

    goto/16 :goto_12

    :pswitch_5a
    move-object/from16 v16, v6

    invoke-virtual {v1, v9}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v2

    iget v2, v2, Landroid/util/TypedValue;->type:I

    const/4 v6, 0x1

    if-ne v2, v6, :cond_a

    const/4 v6, -0x1

    invoke-virtual {v1, v9, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, v14, Landroidx/constraintlayout/widget/b$c;->i:I

    goto/16 :goto_12

    :cond_a
    const/4 v6, 0x3

    if-ne v2, v6, :cond_c

    invoke-virtual {v1, v9}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v14, Landroidx/constraintlayout/widget/b$c;->h:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    if-lez v2, :cond_b

    const/4 v2, -0x1

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v6

    iput v6, v14, Landroidx/constraintlayout/widget/b$c;->i:I

    goto/16 :goto_11

    :cond_b
    const/4 v2, -0x1

    goto/16 :goto_12

    :cond_c
    const/4 v2, -0x1

    iget v6, v14, Landroidx/constraintlayout/widget/b$c;->i:I

    invoke-virtual {v1, v9, v6}, Landroid/content/res/TypedArray;->getInteger(II)I

    goto/16 :goto_11

    :pswitch_5b
    move-object/from16 v16, v6

    const/4 v2, -0x1

    iget v6, v14, Landroidx/constraintlayout/widget/b$c;->f:F

    invoke-virtual {v1, v9, v6}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v6

    iput v6, v14, Landroidx/constraintlayout/widget/b$c;->f:F

    goto/16 :goto_12

    :pswitch_5c
    move-object/from16 v16, v6

    const/4 v2, -0x1

    iget v6, v14, Landroidx/constraintlayout/widget/b$c;->g:I

    invoke-virtual {v1, v9, v6}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v6

    iput v6, v14, Landroidx/constraintlayout/widget/b$c;->g:I

    goto/16 :goto_12

    :pswitch_5d
    move-object/from16 v16, v6

    const/4 v2, -0x1

    iget v6, v13, Landroidx/constraintlayout/widget/b$e;->h:I

    invoke-static {v1, v9, v6}, Landroidx/constraintlayout/widget/b;->g(Landroid/content/res/TypedArray;II)I

    move-result v6

    iput v6, v13, Landroidx/constraintlayout/widget/b$e;->h:I

    goto/16 :goto_12

    :pswitch_5e
    move-object/from16 v16, v6

    const/4 v2, -0x1

    iget v6, v14, Landroidx/constraintlayout/widget/b$c;->b:I

    invoke-virtual {v1, v9, v6}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v6

    iput v6, v14, Landroidx/constraintlayout/widget/b$c;->b:I

    goto/16 :goto_12

    :pswitch_5f
    move-object/from16 v16, v6

    const/4 v2, -0x1

    iget-boolean v6, v15, Landroidx/constraintlayout/widget/b$b;->m0:Z

    invoke-virtual {v1, v9, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, v15, Landroidx/constraintlayout/widget/b$b;->m0:Z

    goto/16 :goto_12

    :pswitch_60
    move-object/from16 v16, v6

    const/4 v2, -0x1

    iget-boolean v6, v15, Landroidx/constraintlayout/widget/b$b;->l0:Z

    invoke-virtual {v1, v9, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, v15, Landroidx/constraintlayout/widget/b$b;->l0:Z

    goto/16 :goto_12

    :pswitch_61
    move-object/from16 v16, v6

    const/4 v2, -0x1

    iget v6, v14, Landroidx/constraintlayout/widget/b$c;->d:F

    invoke-virtual {v1, v9, v6}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v6

    iput v6, v14, Landroidx/constraintlayout/widget/b$c;->d:F

    goto/16 :goto_12

    :pswitch_62
    move-object/from16 v16, v6

    const/4 v2, -0x1

    iget v6, v12, Landroidx/constraintlayout/widget/b$d;->b:I

    invoke-virtual {v1, v9, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v12, Landroidx/constraintlayout/widget/b$d;->b:I

    goto/16 :goto_12

    :pswitch_63
    move-object/from16 v16, v6

    const/4 v2, -0x1

    invoke-virtual {v1, v9}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v15, Landroidx/constraintlayout/widget/b$b;->k0:Ljava/lang/String;

    goto/16 :goto_12

    :pswitch_64
    move-object/from16 v16, v6

    const/4 v2, -0x1

    iget v6, v14, Landroidx/constraintlayout/widget/b$c;->c:I

    invoke-virtual {v1, v9, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v14, Landroidx/constraintlayout/widget/b$c;->c:I

    goto/16 :goto_12

    :pswitch_65
    move-object/from16 v16, v6

    const/4 v2, -0x1

    iget-boolean v6, v15, Landroidx/constraintlayout/widget/b$b;->n0:Z

    invoke-virtual {v1, v9, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, v15, Landroidx/constraintlayout/widget/b$b;->n0:Z

    goto/16 :goto_12

    :pswitch_66
    move-object/from16 v16, v6

    const/4 v2, -0x1

    invoke-virtual {v1, v9}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v15, Landroidx/constraintlayout/widget/b$b;->j0:Ljava/lang/String;

    goto/16 :goto_12

    :pswitch_67
    move-object/from16 v16, v6

    const/4 v2, -0x1

    iget v6, v15, Landroidx/constraintlayout/widget/b$b;->g0:I

    invoke-virtual {v1, v9, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    iput v6, v15, Landroidx/constraintlayout/widget/b$b;->g0:I

    goto/16 :goto_12

    :pswitch_68
    move-object/from16 v16, v6

    const/4 v2, -0x1

    iget v6, v15, Landroidx/constraintlayout/widget/b$b;->f0:I

    invoke-virtual {v1, v9, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v15, Landroidx/constraintlayout/widget/b$b;->f0:I

    goto/16 :goto_12

    :pswitch_69
    move-object/from16 v16, v6

    const/4 v2, -0x1

    invoke-static {v11, v10}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_12

    :pswitch_6a
    move-object/from16 v16, v6

    const/4 v2, -0x1

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-virtual {v1, v9, v6}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v9

    iput v9, v15, Landroidx/constraintlayout/widget/b$b;->e0:F

    goto/16 :goto_12

    :pswitch_6b
    move-object/from16 v16, v6

    const/4 v2, -0x1

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-virtual {v1, v9, v6}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v9

    iput v9, v15, Landroidx/constraintlayout/widget/b$b;->d0:F

    goto/16 :goto_12

    :pswitch_6c
    move-object/from16 v16, v6

    const/high16 v6, 0x3f800000    # 1.0f

    iget v2, v12, Landroidx/constraintlayout/widget/b$d;->d:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, v12, Landroidx/constraintlayout/widget/b$d;->d:F

    goto/16 :goto_12

    :pswitch_6d
    move-object/from16 v16, v6

    const/high16 v6, 0x3f800000    # 1.0f

    iget v2, v14, Landroidx/constraintlayout/widget/b$c;->e:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, v14, Landroidx/constraintlayout/widget/b$c;->e:F

    goto/16 :goto_12

    :pswitch_6e
    move-object/from16 v16, v6

    const/4 v2, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    :goto_11
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto/16 :goto_12

    :pswitch_6f
    move-object/from16 v16, v6

    const/4 v2, 0x0

    invoke-virtual {v1, v9}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v6

    iget v6, v6, Landroid/util/TypedValue;->type:I

    const/4 v2, 0x3

    if-ne v6, v2, :cond_d

    invoke-virtual {v1, v9}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    const/4 v6, 0x0

    goto :goto_11

    :cond_d
    const/4 v6, 0x0

    invoke-virtual {v1, v9, v6}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v9

    aget-object v9, v19, v9

    goto :goto_11

    :pswitch_70
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v14, Landroidx/constraintlayout/widget/b$c;->a:I

    invoke-static {v1, v9, v2}, Landroidx/constraintlayout/widget/b;->g(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, v14, Landroidx/constraintlayout/widget/b$c;->a:I

    goto/16 :goto_12

    :pswitch_71
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->B:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->B:F

    goto/16 :goto_12

    :pswitch_72
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->A:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->A:I

    goto/16 :goto_12

    :pswitch_73
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->z:I

    invoke-static {v1, v9, v2}, Landroidx/constraintlayout/widget/b;->g(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->z:I

    goto/16 :goto_12

    :pswitch_74
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v13, Landroidx/constraintlayout/widget/b$e;->a:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, v13, Landroidx/constraintlayout/widget/b$e;->a:F

    goto/16 :goto_12

    :pswitch_75
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->c0:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->c0:I

    goto/16 :goto_12

    :pswitch_76
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->b0:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->b0:I

    goto/16 :goto_12

    :pswitch_77
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->a0:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->a0:I

    goto/16 :goto_12

    :pswitch_78
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->Z:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->Z:I

    goto/16 :goto_12

    :pswitch_79
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->Y:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->Y:I

    goto/16 :goto_12

    :pswitch_7a
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->X:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->X:I

    goto/16 :goto_12

    :pswitch_7b
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v13, Landroidx/constraintlayout/widget/b$e;->k:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    iput v2, v13, Landroidx/constraintlayout/widget/b$e;->k:F

    goto/16 :goto_12

    :pswitch_7c
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v13, Landroidx/constraintlayout/widget/b$e;->j:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    iput v2, v13, Landroidx/constraintlayout/widget/b$e;->j:F

    goto/16 :goto_12

    :pswitch_7d
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v13, Landroidx/constraintlayout/widget/b$e;->i:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    iput v2, v13, Landroidx/constraintlayout/widget/b$e;->i:F

    goto/16 :goto_12

    :pswitch_7e
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v13, Landroidx/constraintlayout/widget/b$e;->g:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    iput v2, v13, Landroidx/constraintlayout/widget/b$e;->g:F

    goto/16 :goto_12

    :pswitch_7f
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v13, Landroidx/constraintlayout/widget/b$e;->f:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    iput v2, v13, Landroidx/constraintlayout/widget/b$e;->f:F

    goto/16 :goto_12

    :pswitch_80
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v13, Landroidx/constraintlayout/widget/b$e;->e:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, v13, Landroidx/constraintlayout/widget/b$e;->e:F

    goto/16 :goto_12

    :pswitch_81
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v13, Landroidx/constraintlayout/widget/b$e;->d:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, v13, Landroidx/constraintlayout/widget/b$e;->d:F

    goto/16 :goto_12

    :pswitch_82
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v13, Landroidx/constraintlayout/widget/b$e;->c:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, v13, Landroidx/constraintlayout/widget/b$e;->c:F

    goto/16 :goto_12

    :pswitch_83
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v13, Landroidx/constraintlayout/widget/b$e;->b:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, v13, Landroidx/constraintlayout/widget/b$e;->b:F

    goto/16 :goto_12

    :pswitch_84
    move-object/from16 v16, v6

    const/4 v2, 0x1

    const/4 v6, 0x0

    iput-boolean v2, v13, Landroidx/constraintlayout/widget/b$e;->l:Z

    iget v2, v13, Landroidx/constraintlayout/widget/b$e;->m:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    iput v2, v13, Landroidx/constraintlayout/widget/b$e;->m:F

    goto/16 :goto_12

    :pswitch_85
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v12, Landroidx/constraintlayout/widget/b$d;->c:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, v12, Landroidx/constraintlayout/widget/b$d;->c:F

    goto/16 :goto_12

    :pswitch_86
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->W:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->W:I

    goto/16 :goto_12

    :pswitch_87
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->V:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->V:I

    goto/16 :goto_12

    :pswitch_88
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->T:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->T:F

    goto/16 :goto_12

    :pswitch_89
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->U:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->U:F

    goto/16 :goto_12

    :pswitch_8a
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v0, Landroidx/constraintlayout/widget/b$a;->a:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, v0, Landroidx/constraintlayout/widget/b$a;->a:I

    goto/16 :goto_12

    :pswitch_8b
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->x:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->x:F

    goto/16 :goto_12

    :pswitch_8c
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->l:I

    invoke-static {v1, v9, v2}, Landroidx/constraintlayout/widget/b;->g(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->l:I

    goto/16 :goto_12

    :pswitch_8d
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->m:I

    invoke-static {v1, v9, v2}, Landroidx/constraintlayout/widget/b;->g(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->m:I

    goto/16 :goto_12

    :pswitch_8e
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->H:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->H:I

    goto/16 :goto_12

    :pswitch_8f
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->t:I

    invoke-static {v1, v9, v2}, Landroidx/constraintlayout/widget/b;->g(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->t:I

    goto/16 :goto_12

    :pswitch_90
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->s:I

    invoke-static {v1, v9, v2}, Landroidx/constraintlayout/widget/b;->g(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->s:I

    goto/16 :goto_12

    :pswitch_91
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->K:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->K:I

    goto/16 :goto_12

    :pswitch_92
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->k:I

    invoke-static {v1, v9, v2}, Landroidx/constraintlayout/widget/b;->g(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->k:I

    goto/16 :goto_12

    :pswitch_93
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->j:I

    invoke-static {v1, v9, v2}, Landroidx/constraintlayout/widget/b;->g(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->j:I

    goto/16 :goto_12

    :pswitch_94
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->G:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->G:I

    goto/16 :goto_12

    :pswitch_95
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->E:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->E:I

    goto/16 :goto_12

    :pswitch_96
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->i:I

    invoke-static {v1, v9, v2}, Landroidx/constraintlayout/widget/b;->g(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->i:I

    goto/16 :goto_12

    :pswitch_97
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->h:I

    invoke-static {v1, v9, v2}, Landroidx/constraintlayout/widget/b;->g(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->h:I

    goto/16 :goto_12

    :pswitch_98
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->F:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->F:I

    goto/16 :goto_12

    :pswitch_99
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->b:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->b:I

    goto/16 :goto_12

    :pswitch_9a
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v12, Landroidx/constraintlayout/widget/b$d;->a:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    aget v2, v17, v2

    iput v2, v12, Landroidx/constraintlayout/widget/b$d;->a:I

    goto/16 :goto_12

    :pswitch_9b
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->c:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->c:I

    goto/16 :goto_12

    :pswitch_9c
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->w:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->w:F

    goto/16 :goto_12

    :pswitch_9d
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->f:F

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->f:F

    goto/16 :goto_12

    :pswitch_9e
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->e:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->e:I

    goto/16 :goto_12

    :pswitch_9f
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->d:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->d:I

    goto/16 :goto_12

    :pswitch_a0
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->N:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->N:I

    goto/16 :goto_12

    :pswitch_a1
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->R:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->R:I

    goto/16 :goto_12

    :pswitch_a2
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->O:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->O:I

    goto/16 :goto_12

    :pswitch_a3
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->M:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->M:I

    goto/16 :goto_12

    :pswitch_a4
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->Q:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->Q:I

    goto/16 :goto_12

    :pswitch_a5
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->P:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->P:I

    goto/16 :goto_12

    :pswitch_a6
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->u:I

    invoke-static {v1, v9, v2}, Landroidx/constraintlayout/widget/b;->g(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->u:I

    goto/16 :goto_12

    :pswitch_a7
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->v:I

    invoke-static {v1, v9, v2}, Landroidx/constraintlayout/widget/b;->g(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->v:I

    goto :goto_12

    :pswitch_a8
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->J:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->J:I

    goto :goto_12

    :pswitch_a9
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->D:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->D:I

    goto :goto_12

    :pswitch_aa
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->C:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->C:I

    goto :goto_12

    :pswitch_ab
    move-object/from16 v16, v6

    const/4 v6, 0x0

    invoke-virtual {v1, v9}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v15, Landroidx/constraintlayout/widget/b$b;->y:Ljava/lang/String;

    goto :goto_12

    :pswitch_ac
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->n:I

    invoke-static {v1, v9, v2}, Landroidx/constraintlayout/widget/b;->g(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->n:I

    goto :goto_12

    :pswitch_ad
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->o:I

    invoke-static {v1, v9, v2}, Landroidx/constraintlayout/widget/b;->g(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->o:I

    goto :goto_12

    :pswitch_ae
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->I:I

    invoke-virtual {v1, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->I:I

    goto :goto_12

    :pswitch_af
    move-object/from16 v16, v6

    const/4 v6, 0x0

    iget v2, v15, Landroidx/constraintlayout/widget/b$b;->p:I

    invoke-static {v1, v9, v2}, Landroidx/constraintlayout/widget/b;->g(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, v15, Landroidx/constraintlayout/widget/b$b;->p:I

    :goto_12
    add-int/lit8 v7, v7, 0x1

    move/from16 v2, p2

    move-object/from16 v6, v16

    goto/16 :goto_c

    :cond_e
    iget-object v2, v15, Landroidx/constraintlayout/widget/b$b;->j0:Ljava/lang/String;

    if-eqz v2, :cond_f

    const/4 v2, 0x0

    iput-object v2, v15, Landroidx/constraintlayout/widget/b$b;->i0:[I

    .line 4
    :cond_f
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_50
        :pswitch_0
        :pswitch_0
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_0
        :pswitch_0
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_0
        :pswitch_0
        :pswitch_3d
        :pswitch_3c
        :pswitch_0
        :pswitch_0
        :pswitch_3b
        :pswitch_0
        :pswitch_0
        :pswitch_3a
        :pswitch_0
        :pswitch_0
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_0
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_af
        :pswitch_ae
        :pswitch_ad
        :pswitch_ac
        :pswitch_ab
        :pswitch_aa
        :pswitch_a9
        :pswitch_a8
        :pswitch_a7
        :pswitch_a6
        :pswitch_a5
        :pswitch_a4
        :pswitch_a3
        :pswitch_a2
        :pswitch_a1
        :pswitch_a0
        :pswitch_9f
        :pswitch_9e
        :pswitch_9d
        :pswitch_9c
        :pswitch_9b
        :pswitch_9a
        :pswitch_99
        :pswitch_98
        :pswitch_97
        :pswitch_96
        :pswitch_95
        :pswitch_94
        :pswitch_93
        :pswitch_92
        :pswitch_91
        :pswitch_90
        :pswitch_8f
        :pswitch_8e
        :pswitch_8d
        :pswitch_8c
        :pswitch_8b
        :pswitch_8a
        :pswitch_89
        :pswitch_88
        :pswitch_87
        :pswitch_86
        :pswitch_85
        :pswitch_84
        :pswitch_83
        :pswitch_82
        :pswitch_81
        :pswitch_80
        :pswitch_7f
        :pswitch_7e
        :pswitch_7d
        :pswitch_7c
        :pswitch_7b
        :pswitch_7a
        :pswitch_79
        :pswitch_78
        :pswitch_77
        :pswitch_76
        :pswitch_75
        :pswitch_74
        :pswitch_73
        :pswitch_72
        :pswitch_71
        :pswitch_70
        :pswitch_6f
        :pswitch_6e
        :pswitch_6d
        :pswitch_6c
        :pswitch_6b
        :pswitch_6a
        :pswitch_69
        :pswitch_68
        :pswitch_67
        :pswitch_66
        :pswitch_65
        :pswitch_64
        :pswitch_63
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_5a
        :pswitch_59
        :pswitch_51
        :pswitch_51
        :pswitch_51
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_53
        :pswitch_52
    .end packed-switch
.end method

.method public static g(Landroid/content/res/TypedArray;II)I
    .locals 1

    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    invoke-virtual {p0, p1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    :cond_0
    return p2
.end method

.method public static h(Ljava/lang/Object;Landroid/content/res/TypedArray;II)V
    .locals 8

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget v0, v0, Landroid/util/TypedValue;->type:I

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    const/16 v2, 0x15

    .line 12
    .line 13
    const/16 v3, 0x17

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    const/4 v5, -0x1

    .line 17
    const/4 v6, 0x5

    .line 18
    const/4 v7, 0x0

    .line 19
    if-eq v0, v1, :cond_b

    .line 20
    .line 21
    if-eq v0, v6, :cond_3

    .line 22
    .line 23
    invoke-virtual {p1, p2, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    const/4 p2, -0x4

    .line 28
    const/4 v0, -0x2

    .line 29
    if-eq p1, p2, :cond_2

    .line 30
    .line 31
    const/4 p2, -0x3

    .line 32
    if-eq p1, p2, :cond_1

    .line 33
    .line 34
    if-eq p1, v0, :cond_4

    .line 35
    .line 36
    if-eq p1, v5, :cond_4

    .line 37
    .line 38
    :cond_1
    move v4, v7

    .line 39
    goto :goto_0

    .line 40
    :cond_2
    move v7, v0

    .line 41
    goto :goto_0

    .line 42
    :cond_3
    invoke-virtual {p1, p2, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    :cond_4
    move v4, v7

    .line 47
    move v7, p1

    .line 48
    :goto_0
    instance-of p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    .line 49
    .line 50
    if-eqz p1, :cond_6

    .line 51
    .line 52
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    .line 53
    .line 54
    if-nez p3, :cond_5

    .line 55
    .line 56
    iput v7, p0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 57
    .line 58
    iput-boolean v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->W:Z

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_5
    iput v7, p0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 62
    .line 63
    iput-boolean v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->X:Z

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_6
    instance-of p1, p0, Landroidx/constraintlayout/widget/b$b;

    .line 67
    .line 68
    if-eqz p1, :cond_8

    .line 69
    .line 70
    check-cast p0, Landroidx/constraintlayout/widget/b$b;

    .line 71
    .line 72
    if-nez p3, :cond_7

    .line 73
    .line 74
    iput v7, p0, Landroidx/constraintlayout/widget/b$b;->b:I

    .line 75
    .line 76
    iput-boolean v4, p0, Landroidx/constraintlayout/widget/b$b;->l0:Z

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_7
    iput v7, p0, Landroidx/constraintlayout/widget/b$b;->c:I

    .line 80
    .line 81
    iput-boolean v4, p0, Landroidx/constraintlayout/widget/b$b;->m0:Z

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_8
    instance-of p1, p0, Landroidx/constraintlayout/widget/b$a$a;

    .line 85
    .line 86
    if-eqz p1, :cond_a

    .line 87
    .line 88
    check-cast p0, Landroidx/constraintlayout/widget/b$a$a;

    .line 89
    .line 90
    if-nez p3, :cond_9

    .line 91
    .line 92
    invoke-virtual {p0, v3, v7}, Landroidx/constraintlayout/widget/b$a$a;->b(II)V

    .line 93
    .line 94
    .line 95
    const/16 p1, 0x50

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_9
    invoke-virtual {p0, v2, v7}, Landroidx/constraintlayout/widget/b$a$a;->b(II)V

    .line 99
    .line 100
    .line 101
    const/16 p1, 0x51

    .line 102
    .line 103
    :goto_1
    invoke-virtual {p0, p1, v4}, Landroidx/constraintlayout/widget/b$a$a;->c(IZ)V

    .line 104
    .line 105
    .line 106
    :cond_a
    :goto_2
    return-void

    .line 107
    :cond_b
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    if-nez p1, :cond_c

    .line 112
    .line 113
    goto/16 :goto_6

    .line 114
    .line 115
    :cond_c
    const/16 p2, 0x3d

    .line 116
    .line 117
    invoke-virtual {p1, p2}, Ljava/lang/String;->indexOf(I)I

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-lez p2, :cond_1c

    .line 126
    .line 127
    add-int/2addr v0, v5

    .line 128
    if-ge p2, v0, :cond_1c

    .line 129
    .line 130
    invoke-virtual {p1, v7, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    add-int/2addr p2, v4

    .line 135
    invoke-virtual {p1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 140
    .line 141
    .line 142
    move-result p2

    .line 143
    if-lez p2, :cond_1c

    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    const-string v0, "ratio"

    .line 154
    .line 155
    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_10

    .line 160
    .line 161
    instance-of p2, p0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    .line 162
    .line 163
    if-eqz p2, :cond_e

    .line 164
    .line 165
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    .line 166
    .line 167
    if-nez p3, :cond_d

    .line 168
    .line 169
    iput v7, p0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_d
    iput v7, p0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 173
    .line 174
    :goto_3
    invoke-static {p0, p1}, Landroidx/constraintlayout/widget/b;->i(Landroidx/constraintlayout/widget/ConstraintLayout$a;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    goto/16 :goto_6

    .line 178
    .line 179
    :cond_e
    instance-of p2, p0, Landroidx/constraintlayout/widget/b$b;

    .line 180
    .line 181
    if-eqz p2, :cond_f

    .line 182
    .line 183
    check-cast p0, Landroidx/constraintlayout/widget/b$b;

    .line 184
    .line 185
    iput-object p1, p0, Landroidx/constraintlayout/widget/b$b;->y:Ljava/lang/String;

    .line 186
    .line 187
    goto/16 :goto_6

    .line 188
    .line 189
    :cond_f
    instance-of p2, p0, Landroidx/constraintlayout/widget/b$a$a;

    .line 190
    .line 191
    if-eqz p2, :cond_1c

    .line 192
    .line 193
    check-cast p0, Landroidx/constraintlayout/widget/b$a$a;

    .line 194
    .line 195
    invoke-virtual {p0, p1, v6}, Landroidx/constraintlayout/widget/b$a$a;->d(Ljava/lang/String;I)V

    .line 196
    .line 197
    .line 198
    goto/16 :goto_6

    .line 199
    .line 200
    :cond_10
    const-string v0, "weight"

    .line 201
    .line 202
    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_16

    .line 207
    .line 208
    :try_start_0
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 209
    .line 210
    .line 211
    move-result p1

    .line 212
    instance-of p2, p0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    .line 213
    .line 214
    if-eqz p2, :cond_12

    .line 215
    .line 216
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    .line 217
    .line 218
    if-nez p3, :cond_11

    .line 219
    .line 220
    iput v7, p0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 221
    .line 222
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->H:F

    .line 223
    .line 224
    goto/16 :goto_6

    .line 225
    .line 226
    :cond_11
    iput v7, p0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 227
    .line 228
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->I:F

    .line 229
    .line 230
    goto/16 :goto_6

    .line 231
    .line 232
    :cond_12
    instance-of p2, p0, Landroidx/constraintlayout/widget/b$b;

    .line 233
    .line 234
    if-eqz p2, :cond_14

    .line 235
    .line 236
    check-cast p0, Landroidx/constraintlayout/widget/b$b;

    .line 237
    .line 238
    if-nez p3, :cond_13

    .line 239
    .line 240
    iput v7, p0, Landroidx/constraintlayout/widget/b$b;->b:I

    .line 241
    .line 242
    iput p1, p0, Landroidx/constraintlayout/widget/b$b;->U:F

    .line 243
    .line 244
    goto/16 :goto_6

    .line 245
    .line 246
    :cond_13
    iput v7, p0, Landroidx/constraintlayout/widget/b$b;->c:I

    .line 247
    .line 248
    iput p1, p0, Landroidx/constraintlayout/widget/b$b;->T:F

    .line 249
    .line 250
    goto/16 :goto_6

    .line 251
    .line 252
    :cond_14
    instance-of p2, p0, Landroidx/constraintlayout/widget/b$a$a;

    .line 253
    .line 254
    if-eqz p2, :cond_1c

    .line 255
    .line 256
    check-cast p0, Landroidx/constraintlayout/widget/b$a$a;

    .line 257
    .line 258
    if-nez p3, :cond_15

    .line 259
    .line 260
    invoke-virtual {p0, v3, v7}, Landroidx/constraintlayout/widget/b$a$a;->b(II)V

    .line 261
    .line 262
    .line 263
    const/16 p2, 0x27

    .line 264
    .line 265
    goto :goto_4

    .line 266
    :cond_15
    invoke-virtual {p0, v2, v7}, Landroidx/constraintlayout/widget/b$a$a;->b(II)V

    .line 267
    .line 268
    .line 269
    const/16 p2, 0x28

    .line 270
    .line 271
    :goto_4
    invoke-virtual {p0, p2, p1}, Landroidx/constraintlayout/widget/b$a$a;->a(IF)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 272
    .line 273
    .line 274
    goto :goto_6

    .line 275
    :cond_16
    const-string v0, "parent"

    .line 276
    .line 277
    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 278
    .line 279
    .line 280
    move-result p2

    .line 281
    if-eqz p2, :cond_1c

    .line 282
    .line 283
    :try_start_1
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 284
    .line 285
    .line 286
    move-result p1

    .line 287
    const/high16 p2, 0x3f800000    # 1.0f

    .line 288
    .line 289
    invoke-static {p2, p1}, Ljava/lang/Math;->min(FF)F

    .line 290
    .line 291
    .line 292
    move-result p1

    .line 293
    const/4 p2, 0x0

    .line 294
    invoke-static {p2, p1}, Ljava/lang/Math;->max(FF)F

    .line 295
    .line 296
    .line 297
    move-result p1

    .line 298
    instance-of p2, p0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    .line 299
    .line 300
    const/4 v0, 0x2

    .line 301
    if-eqz p2, :cond_18

    .line 302
    .line 303
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    .line 304
    .line 305
    if-nez p3, :cond_17

    .line 306
    .line 307
    iput v7, p0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 308
    .line 309
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->R:F

    .line 310
    .line 311
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->L:I

    .line 312
    .line 313
    goto :goto_6

    .line 314
    :cond_17
    iput v7, p0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 315
    .line 316
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->S:F

    .line 317
    .line 318
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->M:I

    .line 319
    .line 320
    goto :goto_6

    .line 321
    :cond_18
    instance-of p2, p0, Landroidx/constraintlayout/widget/b$b;

    .line 322
    .line 323
    if-eqz p2, :cond_1a

    .line 324
    .line 325
    check-cast p0, Landroidx/constraintlayout/widget/b$b;

    .line 326
    .line 327
    if-nez p3, :cond_19

    .line 328
    .line 329
    iput v7, p0, Landroidx/constraintlayout/widget/b$b;->b:I

    .line 330
    .line 331
    iput p1, p0, Landroidx/constraintlayout/widget/b$b;->d0:F

    .line 332
    .line 333
    iput v0, p0, Landroidx/constraintlayout/widget/b$b;->X:I

    .line 334
    .line 335
    goto :goto_6

    .line 336
    :cond_19
    iput v7, p0, Landroidx/constraintlayout/widget/b$b;->c:I

    .line 337
    .line 338
    iput p1, p0, Landroidx/constraintlayout/widget/b$b;->e0:F

    .line 339
    .line 340
    iput v0, p0, Landroidx/constraintlayout/widget/b$b;->Y:I

    .line 341
    .line 342
    goto :goto_6

    .line 343
    :cond_1a
    instance-of p1, p0, Landroidx/constraintlayout/widget/b$a$a;

    .line 344
    .line 345
    if-eqz p1, :cond_1c

    .line 346
    .line 347
    check-cast p0, Landroidx/constraintlayout/widget/b$a$a;

    .line 348
    .line 349
    if-nez p3, :cond_1b

    .line 350
    .line 351
    invoke-virtual {p0, v3, v7}, Landroidx/constraintlayout/widget/b$a$a;->b(II)V

    .line 352
    .line 353
    .line 354
    const/16 p1, 0x36

    .line 355
    .line 356
    goto :goto_5

    .line 357
    :cond_1b
    invoke-virtual {p0, v2, v7}, Landroidx/constraintlayout/widget/b$a$a;->b(II)V

    .line 358
    .line 359
    .line 360
    const/16 p1, 0x37

    .line 361
    .line 362
    :goto_5
    invoke-virtual {p0, p1, v0}, Landroidx/constraintlayout/widget/b$a$a;->b(II)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 363
    .line 364
    .line 365
    :catch_0
    :cond_1c
    :goto_6
    return-void
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
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
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
.end method

.method public static i(Landroidx/constraintlayout/widget/ConstraintLayout$a;Ljava/lang/String;)V
    .locals 7

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x2c

    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, -0x1

    if-lez v1, :cond_2

    add-int/lit8 v5, v0, -0x1

    if-ge v1, v5, :cond_2

    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    const-string v6, "W"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, "H"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    move v2, v3

    goto :goto_0

    :cond_1
    move v2, v4

    :goto_0
    add-int/2addr v1, v3

    move v4, v2

    move v2, v1

    :cond_2
    const/16 v1, 0x3a

    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-ltz v1, :cond_4

    sub-int/2addr v0, v3

    if-ge v1, v0, :cond_4

    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    add-int/2addr v1, v3

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_5

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_5

    :try_start_0
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v5, v0, v2

    if-lez v5, :cond_5

    cmpl-float v2, v1, v2

    if-lez v2, :cond_5

    if-ne v4, v3, :cond_3

    div-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    goto :goto_1

    :cond_3
    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_4
    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_5

    :try_start_1
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_5
    :goto_1
    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->G:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 1

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/b;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->setConstraintSet(Landroidx/constraintlayout/widget/b;)V

    invoke-virtual {p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public final b(Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Ljava/util/HashSet;

    .line 6
    .line 7
    iget-object v2, p0, Landroidx/constraintlayout/widget/b;->c:Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-direct {v1, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    move v4, v3

    .line 18
    :goto_0
    const/4 v5, 0x1

    .line 19
    if-ge v4, v0, :cond_d

    .line 20
    .line 21
    invoke-virtual {p1, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    invoke-virtual {v6}, Landroid/view/View;->getId()I

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    invoke-virtual {v2, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    const-string v9, "ConstraintSet"

    .line 38
    .line 39
    if-nez v8, :cond_0

    .line 40
    .line 41
    new-instance v5, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v7, "id unknown "

    .line 44
    .line 45
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v6}, Lq/a;->b(Landroid/view/View;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-static {v9, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    goto/16 :goto_4

    .line 63
    .line 64
    :cond_0
    iget-boolean v8, p0, Landroidx/constraintlayout/widget/b;->b:Z

    .line 65
    .line 66
    const/4 v10, -0x1

    .line 67
    if-eqz v8, :cond_2

    .line 68
    .line 69
    if-eq v7, v10, :cond_1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    .line 73
    .line 74
    const-string v0, "All children of ConstraintLayout must have ids to use ConstraintSet"

    .line 75
    .line 76
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p1

    .line 80
    :cond_2
    :goto_1
    if-ne v7, v10, :cond_3

    .line 81
    .line 82
    goto/16 :goto_4

    .line 83
    .line 84
    :cond_3
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    invoke-virtual {v2, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    if-eqz v8, :cond_b

    .line 93
    .line 94
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    invoke-virtual {v1, v8}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    invoke-virtual {v2, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    check-cast v8, Landroidx/constraintlayout/widget/b$a;

    .line 110
    .line 111
    if-nez v8, :cond_4

    .line 112
    .line 113
    goto/16 :goto_4

    .line 114
    .line 115
    :cond_4
    instance-of v9, v6, Landroidx/constraintlayout/widget/Barrier;

    .line 116
    .line 117
    if-eqz v9, :cond_6

    .line 118
    .line 119
    iget-object v9, v8, Landroidx/constraintlayout/widget/b$a;->d:Landroidx/constraintlayout/widget/b$b;

    .line 120
    .line 121
    iput v5, v9, Landroidx/constraintlayout/widget/b$b;->h0:I

    .line 122
    .line 123
    move-object v5, v6

    .line 124
    check-cast v5, Landroidx/constraintlayout/widget/Barrier;

    .line 125
    .line 126
    invoke-virtual {v5, v7}, Landroid/view/View;->setId(I)V

    .line 127
    .line 128
    .line 129
    iget v7, v9, Landroidx/constraintlayout/widget/b$b;->f0:I

    .line 130
    .line 131
    invoke-virtual {v5, v7}, Landroidx/constraintlayout/widget/Barrier;->setType(I)V

    .line 132
    .line 133
    .line 134
    iget v7, v9, Landroidx/constraintlayout/widget/b$b;->g0:I

    .line 135
    .line 136
    invoke-virtual {v5, v7}, Landroidx/constraintlayout/widget/Barrier;->setMargin(I)V

    .line 137
    .line 138
    .line 139
    iget-boolean v7, v9, Landroidx/constraintlayout/widget/b$b;->n0:Z

    .line 140
    .line 141
    invoke-virtual {v5, v7}, Landroidx/constraintlayout/widget/Barrier;->setAllowsGoneWidget(Z)V

    .line 142
    .line 143
    .line 144
    iget-object v7, v9, Landroidx/constraintlayout/widget/b$b;->i0:[I

    .line 145
    .line 146
    if-eqz v7, :cond_5

    .line 147
    .line 148
    invoke-virtual {v5, v7}, Landroidx/constraintlayout/widget/a;->setReferencedIds([I)V

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_5
    iget-object v7, v9, Landroidx/constraintlayout/widget/b$b;->j0:Ljava/lang/String;

    .line 153
    .line 154
    if-eqz v7, :cond_6

    .line 155
    .line 156
    invoke-static {v5, v7}, Landroidx/constraintlayout/widget/b;->d(Landroidx/constraintlayout/widget/Barrier;Ljava/lang/String;)[I

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    iput-object v7, v9, Landroidx/constraintlayout/widget/b$b;->i0:[I

    .line 161
    .line 162
    invoke-virtual {v5, v7}, Landroidx/constraintlayout/widget/a;->setReferencedIds([I)V

    .line 163
    .line 164
    .line 165
    :cond_6
    :goto_2
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    check-cast v5, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    .line 170
    .line 171
    invoke-virtual {v5}, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a()V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v8, v5}, Landroidx/constraintlayout/widget/b$a;->a(Landroidx/constraintlayout/widget/ConstraintLayout$a;)V

    .line 175
    .line 176
    .line 177
    iget-object v7, v8, Landroidx/constraintlayout/widget/b$a;->f:Ljava/util/HashMap;

    .line 178
    .line 179
    invoke-static {v6, v7}, Lr/a;->b(Landroid/view/View;Ljava/util/HashMap;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v6, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 183
    .line 184
    .line 185
    iget-object v5, v8, Landroidx/constraintlayout/widget/b$a;->b:Landroidx/constraintlayout/widget/b$d;

    .line 186
    .line 187
    iget v7, v5, Landroidx/constraintlayout/widget/b$d;->b:I

    .line 188
    .line 189
    if-nez v7, :cond_7

    .line 190
    .line 191
    iget v7, v5, Landroidx/constraintlayout/widget/b$d;->a:I

    .line 192
    .line 193
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 194
    .line 195
    .line 196
    :cond_7
    iget v5, v5, Landroidx/constraintlayout/widget/b$d;->c:F

    .line 197
    .line 198
    invoke-virtual {v6, v5}, Landroid/view/View;->setAlpha(F)V

    .line 199
    .line 200
    .line 201
    iget-object v5, v8, Landroidx/constraintlayout/widget/b$a;->e:Landroidx/constraintlayout/widget/b$e;

    .line 202
    .line 203
    iget v7, v5, Landroidx/constraintlayout/widget/b$e;->a:F

    .line 204
    .line 205
    invoke-virtual {v6, v7}, Landroid/view/View;->setRotation(F)V

    .line 206
    .line 207
    .line 208
    iget v7, v5, Landroidx/constraintlayout/widget/b$e;->b:F

    .line 209
    .line 210
    invoke-virtual {v6, v7}, Landroid/view/View;->setRotationX(F)V

    .line 211
    .line 212
    .line 213
    iget v7, v5, Landroidx/constraintlayout/widget/b$e;->c:F

    .line 214
    .line 215
    invoke-virtual {v6, v7}, Landroid/view/View;->setRotationY(F)V

    .line 216
    .line 217
    .line 218
    iget v7, v5, Landroidx/constraintlayout/widget/b$e;->d:F

    .line 219
    .line 220
    invoke-virtual {v6, v7}, Landroid/view/View;->setScaleX(F)V

    .line 221
    .line 222
    .line 223
    iget v7, v5, Landroidx/constraintlayout/widget/b$e;->e:F

    .line 224
    .line 225
    invoke-virtual {v6, v7}, Landroid/view/View;->setScaleY(F)V

    .line 226
    .line 227
    .line 228
    iget v7, v5, Landroidx/constraintlayout/widget/b$e;->h:I

    .line 229
    .line 230
    if-eq v7, v10, :cond_8

    .line 231
    .line 232
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    check-cast v7, Landroid/view/View;

    .line 237
    .line 238
    iget v8, v5, Landroidx/constraintlayout/widget/b$e;->h:I

    .line 239
    .line 240
    invoke-virtual {v7, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    if-eqz v7, :cond_a

    .line 245
    .line 246
    invoke-virtual {v7}, Landroid/view/View;->getTop()I

    .line 247
    .line 248
    .line 249
    move-result v8

    .line 250
    invoke-virtual {v7}, Landroid/view/View;->getBottom()I

    .line 251
    .line 252
    .line 253
    move-result v9

    .line 254
    add-int/2addr v9, v8

    .line 255
    int-to-float v8, v9

    .line 256
    const/high16 v9, 0x40000000    # 2.0f

    .line 257
    .line 258
    div-float/2addr v8, v9

    .line 259
    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    .line 260
    .line 261
    .line 262
    move-result v10

    .line 263
    invoke-virtual {v7}, Landroid/view/View;->getRight()I

    .line 264
    .line 265
    .line 266
    move-result v7

    .line 267
    add-int/2addr v7, v10

    .line 268
    int-to-float v7, v7

    .line 269
    div-float/2addr v7, v9

    .line 270
    invoke-virtual {v6}, Landroid/view/View;->getRight()I

    .line 271
    .line 272
    .line 273
    move-result v9

    .line 274
    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    .line 275
    .line 276
    .line 277
    move-result v10

    .line 278
    sub-int/2addr v9, v10

    .line 279
    if-lez v9, :cond_a

    .line 280
    .line 281
    invoke-virtual {v6}, Landroid/view/View;->getBottom()I

    .line 282
    .line 283
    .line 284
    move-result v9

    .line 285
    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    .line 286
    .line 287
    .line 288
    move-result v10

    .line 289
    sub-int/2addr v9, v10

    .line 290
    if-lez v9, :cond_a

    .line 291
    .line 292
    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    .line 293
    .line 294
    .line 295
    move-result v9

    .line 296
    int-to-float v9, v9

    .line 297
    sub-float/2addr v7, v9

    .line 298
    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    .line 299
    .line 300
    .line 301
    move-result v9

    .line 302
    int-to-float v9, v9

    .line 303
    sub-float/2addr v8, v9

    .line 304
    invoke-virtual {v6, v7}, Landroid/view/View;->setPivotX(F)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v6, v8}, Landroid/view/View;->setPivotY(F)V

    .line 308
    .line 309
    .line 310
    goto :goto_3

    .line 311
    :cond_8
    iget v7, v5, Landroidx/constraintlayout/widget/b$e;->f:F

    .line 312
    .line 313
    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    .line 314
    .line 315
    .line 316
    move-result v7

    .line 317
    if-nez v7, :cond_9

    .line 318
    .line 319
    iget v7, v5, Landroidx/constraintlayout/widget/b$e;->f:F

    .line 320
    .line 321
    invoke-virtual {v6, v7}, Landroid/view/View;->setPivotX(F)V

    .line 322
    .line 323
    .line 324
    :cond_9
    iget v7, v5, Landroidx/constraintlayout/widget/b$e;->g:F

    .line 325
    .line 326
    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    .line 327
    .line 328
    .line 329
    move-result v7

    .line 330
    if-nez v7, :cond_a

    .line 331
    .line 332
    iget v7, v5, Landroidx/constraintlayout/widget/b$e;->g:F

    .line 333
    .line 334
    invoke-virtual {v6, v7}, Landroid/view/View;->setPivotY(F)V

    .line 335
    .line 336
    .line 337
    :cond_a
    :goto_3
    iget v7, v5, Landroidx/constraintlayout/widget/b$e;->i:F

    .line 338
    .line 339
    invoke-virtual {v6, v7}, Landroid/view/View;->setTranslationX(F)V

    .line 340
    .line 341
    .line 342
    iget v7, v5, Landroidx/constraintlayout/widget/b$e;->j:F

    .line 343
    .line 344
    invoke-virtual {v6, v7}, Landroid/view/View;->setTranslationY(F)V

    .line 345
    .line 346
    .line 347
    iget v7, v5, Landroidx/constraintlayout/widget/b$e;->k:F

    .line 348
    .line 349
    invoke-virtual {v6, v7}, Landroid/view/View;->setTranslationZ(F)V

    .line 350
    .line 351
    .line 352
    iget-boolean v7, v5, Landroidx/constraintlayout/widget/b$e;->l:Z

    .line 353
    .line 354
    if-eqz v7, :cond_c

    .line 355
    .line 356
    iget v5, v5, Landroidx/constraintlayout/widget/b$e;->m:F

    .line 357
    .line 358
    invoke-virtual {v6, v5}, Landroid/view/View;->setElevation(F)V

    .line 359
    .line 360
    .line 361
    goto :goto_4

    .line 362
    :cond_b
    new-instance v5, Ljava/lang/StringBuilder;

    .line 363
    .line 364
    const-string v6, "WARNING NO CONSTRAINTS for view "

    .line 365
    .line 366
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v5

    .line 376
    invoke-static {v9, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 377
    .line 378
    .line 379
    :cond_c
    :goto_4
    add-int/lit8 v4, v4, 0x1

    .line 380
    .line 381
    goto/16 :goto_0

    .line 382
    .line 383
    :cond_d
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    :cond_e
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 388
    .line 389
    .line 390
    move-result v4

    .line 391
    if-eqz v4, :cond_13

    .line 392
    .line 393
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v4

    .line 397
    check-cast v4, Ljava/lang/Integer;

    .line 398
    .line 399
    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v6

    .line 403
    check-cast v6, Landroidx/constraintlayout/widget/b$a;

    .line 404
    .line 405
    if-nez v6, :cond_f

    .line 406
    .line 407
    goto :goto_5

    .line 408
    :cond_f
    iget-object v7, v6, Landroidx/constraintlayout/widget/b$a;->d:Landroidx/constraintlayout/widget/b$b;

    .line 409
    .line 410
    iget v8, v7, Landroidx/constraintlayout/widget/b$b;->h0:I

    .line 411
    .line 412
    if-ne v8, v5, :cond_12

    .line 413
    .line 414
    new-instance v8, Landroidx/constraintlayout/widget/Barrier;

    .line 415
    .line 416
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 417
    .line 418
    .line 419
    move-result-object v9

    .line 420
    invoke-direct {v8, v9}, Landroidx/constraintlayout/widget/Barrier;-><init>(Landroid/content/Context;)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 424
    .line 425
    .line 426
    move-result v9

    .line 427
    invoke-virtual {v8, v9}, Landroid/view/View;->setId(I)V

    .line 428
    .line 429
    .line 430
    iget-object v9, v7, Landroidx/constraintlayout/widget/b$b;->i0:[I

    .line 431
    .line 432
    if-eqz v9, :cond_10

    .line 433
    .line 434
    invoke-virtual {v8, v9}, Landroidx/constraintlayout/widget/a;->setReferencedIds([I)V

    .line 435
    .line 436
    .line 437
    goto :goto_6

    .line 438
    :cond_10
    iget-object v9, v7, Landroidx/constraintlayout/widget/b$b;->j0:Ljava/lang/String;

    .line 439
    .line 440
    if-eqz v9, :cond_11

    .line 441
    .line 442
    invoke-static {v8, v9}, Landroidx/constraintlayout/widget/b;->d(Landroidx/constraintlayout/widget/Barrier;Ljava/lang/String;)[I

    .line 443
    .line 444
    .line 445
    move-result-object v9

    .line 446
    iput-object v9, v7, Landroidx/constraintlayout/widget/b$b;->i0:[I

    .line 447
    .line 448
    invoke-virtual {v8, v9}, Landroidx/constraintlayout/widget/a;->setReferencedIds([I)V

    .line 449
    .line 450
    .line 451
    :cond_11
    :goto_6
    iget v9, v7, Landroidx/constraintlayout/widget/b$b;->f0:I

    .line 452
    .line 453
    invoke-virtual {v8, v9}, Landroidx/constraintlayout/widget/Barrier;->setType(I)V

    .line 454
    .line 455
    .line 456
    iget v9, v7, Landroidx/constraintlayout/widget/b$b;->g0:I

    .line 457
    .line 458
    invoke-virtual {v8, v9}, Landroidx/constraintlayout/widget/Barrier;->setMargin(I)V

    .line 459
    .line 460
    .line 461
    sget-object v9, Landroidx/constraintlayout/widget/ConstraintLayout;->q:Lr/e;

    .line 462
    .line 463
    new-instance v9, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    .line 464
    .line 465
    invoke-direct {v9}, Landroidx/constraintlayout/widget/ConstraintLayout$a;-><init>()V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v8}, Landroidx/constraintlayout/widget/a;->k()V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v6, v9}, Landroidx/constraintlayout/widget/b$a;->a(Landroidx/constraintlayout/widget/ConstraintLayout$a;)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {p1, v8, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 475
    .line 476
    .line 477
    :cond_12
    iget-boolean v7, v7, Landroidx/constraintlayout/widget/b$b;->a:Z

    .line 478
    .line 479
    if-eqz v7, :cond_e

    .line 480
    .line 481
    new-instance v7, Landroidx/constraintlayout/widget/d;

    .line 482
    .line 483
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 484
    .line 485
    .line 486
    move-result-object v8

    .line 487
    invoke-direct {v7, v8}, Landroidx/constraintlayout/widget/d;-><init>(Landroid/content/Context;)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 491
    .line 492
    .line 493
    move-result v4

    .line 494
    invoke-virtual {v7, v4}, Landroid/view/View;->setId(I)V

    .line 495
    .line 496
    .line 497
    sget-object v4, Landroidx/constraintlayout/widget/ConstraintLayout;->q:Lr/e;

    .line 498
    .line 499
    new-instance v4, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    .line 500
    .line 501
    invoke-direct {v4}, Landroidx/constraintlayout/widget/ConstraintLayout$a;-><init>()V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v6, v4}, Landroidx/constraintlayout/widget/b$a;->a(Landroidx/constraintlayout/widget/ConstraintLayout$a;)V

    .line 505
    .line 506
    .line 507
    invoke-virtual {p1, v7, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 508
    .line 509
    .line 510
    goto :goto_5

    .line 511
    :cond_13
    :goto_7
    if-ge v3, v0, :cond_15

    .line 512
    .line 513
    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    instance-of v2, v1, Landroidx/constraintlayout/widget/a;

    .line 518
    .line 519
    if-eqz v2, :cond_14

    .line 520
    .line 521
    check-cast v1, Landroidx/constraintlayout/widget/a;

    .line 522
    .line 523
    invoke-virtual {v1, p1}, Landroidx/constraintlayout/widget/a;->g(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 524
    .line 525
    .line 526
    :cond_14
    add-int/lit8 v3, v3, 0x1

    .line 527
    .line 528
    goto :goto_7

    .line 529
    :cond_15
    return-void
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

.method public final c(Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    iget-object v3, v1, Landroidx/constraintlayout/widget/b;->c:Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V

    .line 10
    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    :goto_0
    if-ge v5, v2, :cond_a

    .line 14
    .line 15
    move-object/from16 v6, p1

    .line 16
    .line 17
    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v7

    .line 21
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    move-object v8, v0

    .line 26
    check-cast v8, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    .line 27
    .line 28
    invoke-virtual {v7}, Landroid/view/View;->getId()I

    .line 29
    .line 30
    .line 31
    move-result v9

    .line 32
    iget-boolean v0, v1, Landroidx/constraintlayout/widget/b;->b:Z

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    const/4 v0, -0x1

    .line 37
    if-eq v9, v0, :cond_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 41
    .line 42
    const-string v2, "All children of ConstraintLayout must have ids to use ConstraintSet"

    .line 43
    .line 44
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v0

    .line 48
    :cond_1
    :goto_1
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v3, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_2

    .line 57
    .line 58
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    new-instance v10, Landroidx/constraintlayout/widget/b$a;

    .line 63
    .line 64
    invoke-direct {v10}, Landroidx/constraintlayout/widget/b$a;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, v0, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    :cond_2
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    move-object v10, v0

    .line 79
    check-cast v10, Landroidx/constraintlayout/widget/b$a;

    .line 80
    .line 81
    if-nez v10, :cond_3

    .line 82
    .line 83
    move/from16 v16, v2

    .line 84
    .line 85
    const/4 v4, 0x0

    .line 86
    goto/16 :goto_7

    .line 87
    .line 88
    :cond_3
    iget-object v11, v1, Landroidx/constraintlayout/widget/b;->a:Ljava/util/HashMap;

    .line 89
    .line 90
    new-instance v12, Ljava/util/HashMap;

    .line 91
    .line 92
    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    move-result-object v13

    .line 99
    invoke-virtual {v11}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v14

    .line 107
    :goto_2
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_5

    .line 112
    .line 113
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    check-cast v0, Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {v11, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v15

    .line 123
    check-cast v15, Lr/a;

    .line 124
    .line 125
    :try_start_0
    const-string v4, "BackgroundColor"

    .line 126
    .line 127
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    if-eqz v4, :cond_4

    .line 132
    .line 133
    invoke-virtual {v7}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    check-cast v4, Landroid/graphics/drawable/ColorDrawable;

    .line 138
    .line 139
    invoke-virtual {v4}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    new-instance v1, Lr/a;

    .line 148
    .line 149
    invoke-direct {v1, v15, v4}, Lr/a;-><init>(Lr/a;Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    move/from16 v16, v2

    .line 153
    .line 154
    const/4 v4, 0x0

    .line 155
    goto :goto_3

    .line 156
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 159
    .line 160
    .line 161
    const-string v4, "getMap"

    .line 162
    .line 163
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3

    .line 173
    move/from16 v16, v2

    .line 174
    .line 175
    const/4 v4, 0x0

    .line 176
    :try_start_1
    new-array v2, v4, [Ljava/lang/Class;

    .line 177
    .line 178
    invoke-virtual {v13, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    new-array v2, v4, [Ljava/lang/Object;

    .line 183
    .line 184
    invoke-virtual {v1, v7, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    new-instance v2, Lr/a;

    .line 189
    .line 190
    invoke-direct {v2, v15, v1}, Lr/a;-><init>(Lr/a;Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    move-object v1, v2

    .line 194
    :goto_3
    invoke-virtual {v12, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_0

    .line 195
    .line 196
    .line 197
    goto :goto_6

    .line 198
    :catch_0
    move-exception v0

    .line 199
    goto :goto_5

    .line 200
    :catch_1
    move-exception v0

    .line 201
    goto :goto_5

    .line 202
    :catch_2
    move-exception v0

    .line 203
    goto :goto_5

    .line 204
    :catch_3
    move-exception v0

    .line 205
    :goto_4
    move/from16 v16, v2

    .line 206
    .line 207
    const/4 v4, 0x0

    .line 208
    goto :goto_5

    .line 209
    :catch_4
    move-exception v0

    .line 210
    goto :goto_4

    .line 211
    :catch_5
    move-exception v0

    .line 212
    goto :goto_4

    .line 213
    :goto_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 214
    .line 215
    .line 216
    :goto_6
    move-object/from16 v1, p0

    .line 217
    .line 218
    move/from16 v2, v16

    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_5
    move/from16 v16, v2

    .line 222
    .line 223
    const/4 v4, 0x0

    .line 224
    iput-object v12, v10, Landroidx/constraintlayout/widget/b$a;->f:Ljava/util/HashMap;

    .line 225
    .line 226
    invoke-virtual {v10, v9, v8}, Landroidx/constraintlayout/widget/b$a;->b(ILandroidx/constraintlayout/widget/ConstraintLayout$a;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    iget-object v1, v10, Landroidx/constraintlayout/widget/b$a;->b:Landroidx/constraintlayout/widget/b$d;

    .line 234
    .line 235
    iput v0, v1, Landroidx/constraintlayout/widget/b$d;->a:I

    .line 236
    .line 237
    invoke-virtual {v7}, Landroid/view/View;->getAlpha()F

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    iput v0, v1, Landroidx/constraintlayout/widget/b$d;->c:F

    .line 242
    .line 243
    invoke-virtual {v7}, Landroid/view/View;->getRotation()F

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    iget-object v1, v10, Landroidx/constraintlayout/widget/b$a;->e:Landroidx/constraintlayout/widget/b$e;

    .line 248
    .line 249
    iput v0, v1, Landroidx/constraintlayout/widget/b$e;->a:F

    .line 250
    .line 251
    invoke-virtual {v7}, Landroid/view/View;->getRotationX()F

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    iput v0, v1, Landroidx/constraintlayout/widget/b$e;->b:F

    .line 256
    .line 257
    invoke-virtual {v7}, Landroid/view/View;->getRotationY()F

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    iput v0, v1, Landroidx/constraintlayout/widget/b$e;->c:F

    .line 262
    .line 263
    invoke-virtual {v7}, Landroid/view/View;->getScaleX()F

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    iput v0, v1, Landroidx/constraintlayout/widget/b$e;->d:F

    .line 268
    .line 269
    invoke-virtual {v7}, Landroid/view/View;->getScaleY()F

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    iput v0, v1, Landroidx/constraintlayout/widget/b$e;->e:F

    .line 274
    .line 275
    invoke-virtual {v7}, Landroid/view/View;->getPivotX()F

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    invoke-virtual {v7}, Landroid/view/View;->getPivotY()F

    .line 280
    .line 281
    .line 282
    move-result v2

    .line 283
    float-to-double v8, v0

    .line 284
    const-wide/16 v11, 0x0

    .line 285
    .line 286
    cmpl-double v8, v8, v11

    .line 287
    .line 288
    if-nez v8, :cond_6

    .line 289
    .line 290
    float-to-double v8, v2

    .line 291
    cmpl-double v8, v8, v11

    .line 292
    .line 293
    if-eqz v8, :cond_7

    .line 294
    .line 295
    :cond_6
    iput v0, v1, Landroidx/constraintlayout/widget/b$e;->f:F

    .line 296
    .line 297
    iput v2, v1, Landroidx/constraintlayout/widget/b$e;->g:F

    .line 298
    .line 299
    :cond_7
    invoke-virtual {v7}, Landroid/view/View;->getTranslationX()F

    .line 300
    .line 301
    .line 302
    move-result v0

    .line 303
    iput v0, v1, Landroidx/constraintlayout/widget/b$e;->i:F

    .line 304
    .line 305
    invoke-virtual {v7}, Landroid/view/View;->getTranslationY()F

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    iput v0, v1, Landroidx/constraintlayout/widget/b$e;->j:F

    .line 310
    .line 311
    invoke-virtual {v7}, Landroid/view/View;->getTranslationZ()F

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    iput v0, v1, Landroidx/constraintlayout/widget/b$e;->k:F

    .line 316
    .line 317
    iget-boolean v0, v1, Landroidx/constraintlayout/widget/b$e;->l:Z

    .line 318
    .line 319
    if-eqz v0, :cond_8

    .line 320
    .line 321
    invoke-virtual {v7}, Landroid/view/View;->getElevation()F

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    iput v0, v1, Landroidx/constraintlayout/widget/b$e;->m:F

    .line 326
    .line 327
    :cond_8
    instance-of v0, v7, Landroidx/constraintlayout/widget/Barrier;

    .line 328
    .line 329
    if-eqz v0, :cond_9

    .line 330
    .line 331
    check-cast v7, Landroidx/constraintlayout/widget/Barrier;

    .line 332
    .line 333
    invoke-virtual {v7}, Landroidx/constraintlayout/widget/Barrier;->getAllowsGoneWidget()Z

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    iget-object v1, v10, Landroidx/constraintlayout/widget/b$a;->d:Landroidx/constraintlayout/widget/b$b;

    .line 338
    .line 339
    iput-boolean v0, v1, Landroidx/constraintlayout/widget/b$b;->n0:Z

    .line 340
    .line 341
    invoke-virtual {v7}, Landroidx/constraintlayout/widget/a;->getReferencedIds()[I

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    iput-object v0, v1, Landroidx/constraintlayout/widget/b$b;->i0:[I

    .line 346
    .line 347
    invoke-virtual {v7}, Landroidx/constraintlayout/widget/Barrier;->getType()I

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    iput v0, v1, Landroidx/constraintlayout/widget/b$b;->f0:I

    .line 352
    .line 353
    invoke-virtual {v7}, Landroidx/constraintlayout/widget/Barrier;->getMargin()I

    .line 354
    .line 355
    .line 356
    move-result v0

    .line 357
    iput v0, v1, Landroidx/constraintlayout/widget/b$b;->g0:I

    .line 358
    .line 359
    :cond_9
    :goto_7
    add-int/lit8 v5, v5, 0x1

    .line 360
    .line 361
    move-object/from16 v1, p0

    .line 362
    .line 363
    move/from16 v2, v16

    .line 364
    .line 365
    goto/16 :goto_0

    .line 366
    .line 367
    :cond_a
    return-void
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
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

.method public final f(Landroid/content/Context;I)V
    .locals 4

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p2

    :try_start_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    :goto_0
    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    if-eqz v0, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {p1, v2, v3}, Landroidx/constraintlayout/widget/b;->e(Landroid/content/Context;Landroid/util/AttributeSet;Z)Landroidx/constraintlayout/widget/b$a;

    move-result-object v2

    const-string v3, "Guideline"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v2, Landroidx/constraintlayout/widget/b$a;->d:Landroidx/constraintlayout/widget/b$b;

    iput-boolean v1, v0, Landroidx/constraintlayout/widget/b$b;->a:Z

    :cond_1
    iget-object v0, p0, Landroidx/constraintlayout/widget/b;->c:Ljava/util/HashMap;

    iget v1, v2, Landroidx/constraintlayout/widget/b$a;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    :goto_1
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_2

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Lorg/xmlpull/v1/XmlPullParserException;->printStackTrace()V

    :cond_3
    :goto_2
    return-void
.end method
